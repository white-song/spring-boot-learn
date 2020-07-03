package com.white.learn.web;

import com.white.learn.model.Message;
import com.white.learn.repository.MessageRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "消息")
@RestController
public class MessageController {
	@Autowired
	private MessageRepository messageRepository;

	@ApiOperation(
			value = "消息列表",
			notes = "完整的消息内容列表",
			produces="application/json, application/xml",
			consumes="application/json, application/xml",
			response = List.class)
	@GetMapping(value = "messages")
	public List<Message> list() {
		return this.messageRepository.findAll();
	}


	@ApiOperation(
			value = "添加消息",
			notes = "根据参数创建消息"
	)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "消息 ID", required = true, dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "text", value = "正文", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "summary", value = "摘要", required = false, dataType = "String", paramType = "query"),
	})
	@PostMapping(value = "message")
	public Message create(Message message) {
		message = this.messageRepository.save(message);
		return message;
	}

	@PutMapping(value = "message")
	public Message modify(Message message) {
		Message messageResult=this.messageRepository.update(message);
		return messageResult;
	}

	@PatchMapping(value="/message/text")
	public Message patch(Message message) {
		Message messageResult=this.messageRepository.updateText(message);
		return messageResult;
	}

	@GetMapping(value = "message/{id}")
	public Message get(@PathVariable Long id) {
		Message message = this.messageRepository.findMessage(id);
		return message;
	}

	@DeleteMapping(value = "message/{id}")
	public void delete(@PathVariable("id") Long id) {
		this.messageRepository.deleteMessage(id);
	}
}
