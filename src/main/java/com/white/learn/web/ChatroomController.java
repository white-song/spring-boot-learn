package com.white.learn.web;


import com.white.learn.utils.WebSocketUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@RestController
@ServerEndpoint("/chat-room/{username}")
public class ChatroomController {
	private static final Logger logger = LoggerFactory.getLogger(ChatroomController.class);

	@OnOpen
	public void openSession(@PathParam(value = "username")String username, Session session) {
		WebSocketUtils.ONLINE_USER_SESSIONS.put(username, session);
		String message = "欢迎用户[" + username + "] 来到聊天室！";
		logger.info("用户登录："+message);
		WebSocketUtils.sendMessageAll(message);
	}

	@OnMessage
	public void onMessage(@PathParam("username") String username, String message) {
		logger.info("发送消息："+message);
		WebSocketUtils.sendMessageAll("用户[" + username + "] : " + message);
	}

	@OnClose
	public void onClose(@PathParam("username") String username, Session session) {
		//当前的Session 移除
		WebSocketUtils.ONLINE_USER_SESSIONS.remove(username);
		//并且通知其他人当前用户已经离开聊天室了
		WebSocketUtils.sendMessageAll("用户[" + username + "] 已经离开聊天室了！");
		try {
			session.close();
		} catch (IOException e) {
			logger.error("onClose error",e);
		}
	}

	@OnError
	public void onError(Session session, Throwable throwable) {
		try {
			session.close();
		} catch (IOException e) {
			logger.error("onError excepiton",e);
		}
		logger.info("Throwable msg "+throwable.getMessage());
	}

}
