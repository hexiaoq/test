package com.hxq.vueblog.service.impl;

import com.hxq.vueblog.entity.User;
import com.hxq.vueblog.mapper.UserMapper;
import com.hxq.vueblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hxq
 * @since 2020-10-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
