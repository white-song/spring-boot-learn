package com.white.learn.web;

import com.white.learn.model.UserInfo;
import com.white.learn.param.UserInfoParam;
import com.white.learn.repository.UserInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    private UserInfoRepository userInfoRepository;
//
//    @RequestMapping("/list")
//    @Cacheable(value="user_list")
//    public String list(Model model,@RequestParam(value = "page", defaultValue = "0") Integer page,
//                       @RequestParam(value = "size", defaultValue = "6") Integer size) {
//        Sort sort =  Sort.by("id").descending();
//        Pageable pageable = PageRequest.of(page, size, sort);
//        Page<UserInfo> users=userInfoRepository.findAll(pageable);
//        model.addAttribute("users", users);
//        logger.info("user list "+ users.getContent());
//        return "user/list";
//    }
//
//    @RequestMapping("/toAdd")
//    public String toAdd() {
//        return "user/userAdd";
//    }
//
//    @RequestMapping("/add")
//    public String add(@Valid UserInfoParam userParam, BindingResult result, ModelMap model) {
//        String errorMsg="";
//        if(result.hasErrors()) {
//            List<ObjectError> list = result.getAllErrors();
//            for (ObjectError error : list) {
//                errorMsg=errorMsg + error.getCode() + "-" + error.getDefaultMessage() +";";
//            }
//            model.addAttribute("errorMsg",errorMsg);
//            return "user/userAdd";
//        }
//        UserInfo u= userInfoRepository.findByUserNameOrEmail(userParam.getUserName(),userParam.getEmail());
//        if(u!=null){
//            model.addAttribute("errorMsg","用户已存在!");
//            return "user/userAdd";
//        }
//        UserInfo user=new UserInfo();
//        BeanUtils.copyProperties(userParam,user);
//        user.setRegTime(new Date());
//        user.setUserType("user");
//        userInfoRepository.save(user);
//        return "redirect:/list";
//    }
//
//    @RequestMapping("/toEdit")
//    public String toEdit(Model model,String id) {
//        UserInfo user=userInfoRepository.findById(id).get();
//        model.addAttribute("user", user);
//        return "user/userEdit";
//    }
//
//    @RequestMapping("/edit")
//    public String edit(@Valid UserInfoParam userParam, BindingResult result,ModelMap model) {
//        String errorMsg="";
//        if(result.hasErrors()) {
//            List<ObjectError> list = result.getAllErrors();
//            for (ObjectError error : list) {
//                errorMsg=errorMsg + error.getCode() + "-" + error.getDefaultMessage() +";";
//            }
//            model.addAttribute("errorMsg",errorMsg);
//            model.addAttribute("user", userParam);
//            return "user/userEdit";
//        }
//
//        UserInfo user=userInfoRepository.findById(userParam.getId()).get();
//        BeanUtils.copyProperties(userParam,user);
//        user.setRegTime(new Date());
//        userInfoRepository.save(user);
//        return "redirect:/list";
//    }
//
//    @RequestMapping("/delete")
//    public String delete(String id) {
//        userInfoRepository.deleteById(id);
//        return "redirect:/list";
//    }
}
