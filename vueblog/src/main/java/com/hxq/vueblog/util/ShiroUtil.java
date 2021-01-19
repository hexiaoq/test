package com.hxq.vueblog.util;


import org.apache.shiro.SecurityUtils;
import com.hxq.vueblog.shiro.AccountProfile;

public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
