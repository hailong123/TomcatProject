package com.hailong.tomcat.endpoint;

import com.hailong.tomcat.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: seadragon
 * @Date: 2019-11-04 17:26
 * @Description:
 */

@RestController
public class LoginEndpoint {

    @Resource
    private LoginService loginService;

    @GetMapping("/login")
    public String login() {
        return loginService.login();
    }

    @PostMapping("/register")
    public String register() {
        return loginService.regist();
    }

    @GetMapping("/test")
    public String test() {
        return loginService.test();
    }
}
