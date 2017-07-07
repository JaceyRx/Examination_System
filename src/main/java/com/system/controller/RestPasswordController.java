package com.system.controller;

import com.system.exception.CustomException;
import com.system.po.Userlogin;
import com.system.service.UserloginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by Jacey on 2017/7/6.
 */
@Controller
public class RestPasswordController {

    @Resource(name = "userloginServiceImpl")
    private UserloginService userloginService;

    // 本账户密码重置
    @RequestMapping(value = "/passwordRest", method = {RequestMethod.POST})
    public String passwordRest(String oldPassword, String password1) throws Exception {
        Subject subject = SecurityUtils.getSubject();
        String username = (String) subject.getPrincipal();

        Userlogin userlogin = userloginService.findByName(username);

        if (!oldPassword.equals(userlogin.getPassword())) {
            throw new CustomException("旧密码不正确");
        } else {
            userlogin.setPassword(password1);
            userloginService.updateByName(username, userlogin);
        }

        return "redirect:/logout";
    }

}
