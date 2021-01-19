package com.hxq.vueblog.service.impl;

import com.hxq.vueblog.entity.Blog;
import com.hxq.vueblog.mapper.BlogMapper;
import com.hxq.vueblog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
