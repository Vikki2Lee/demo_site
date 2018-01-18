package com.vikki.myproject.modules.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 表单验证(包括验证码)过滤类
 * <p>Title: LoginController</p>
 * <p>Description: </p>
 *
 * @author Vikki
 * @date 2018/01/17 下午 3:18
 */
@Controller
public class LoginController {

    @RequestMapping(value = {"","login"},method = RequestMethod.GET)
    public String login(){
        return "/modules/sys/sysLogin";
    }
}
