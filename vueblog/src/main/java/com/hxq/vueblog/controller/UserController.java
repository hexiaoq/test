package com.hxq.vueblog.controller;


import com.hxq.vueblog.common.lang.result;
import com.hxq.vueblog.entity.User;
import com.hxq.vueblog.service.UserService;
import com.hxq.vueblog.service.impl.UserServiceImpl;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hxq
 * @since 2020-10-13
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

@RequiresAuthentication
    @RequestMapping("/index")
    public result index()
    {
        User byId = userService.getById(1L);
        return result.succ(byId);

    }
    @PostMapping("/save")
    public result save(@Validated @RequestBody User user)
    {
        return result.succ(user);


    }

}
