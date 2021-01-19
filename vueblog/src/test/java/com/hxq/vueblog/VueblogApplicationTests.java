package com.hxq.vueblog;


import com.hxq.vueblog.mapper.BlogMapper;
import com.hxq.vueblog.service.BlogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VueblogApplicationTests {
@Autowired
    BlogService blogService;
    @Test
    void contextLoads() {
   blogService.list(null).forEach(System.out::println);


    }

}
