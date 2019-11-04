package com.hailong.tomcat.service.Impl;

import com.hailong.tomcat.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * @Auther: seadragon
 * @Date: 2019-11-04 17:25
 * @Description:
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String login() {
        return "Hello word";
    }
}
