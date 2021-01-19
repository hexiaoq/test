package com.hxq.vueblog.shiro;

import org.apache.shiro.authc.AuthenticationToken;
import org.springframework.stereotype.Component;


public class jwttoken implements AuthenticationToken {
    private String token;
    public jwttoken(String jwt)
    {
        this.token=jwt;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
