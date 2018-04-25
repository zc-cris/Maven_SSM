package com.zc.cris.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.zc.cris.dao.model.UserPO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:config/applicationContext.xml",
        "file:src/main/webapp/WEB-INF/springDispatcherServlet-servlet.xml" })
public class MVCTest {

    // 注入 SpringMVC 的ioc 容器，必须使用 @WebAppConfiguration 注解
    @Autowired
    WebApplicationContext context;

    // 虚拟 mvc 请求，获取到处理结果
    MockMvc mockMvc;
    
    @Before
    public void initMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    // 模拟用户请求测试controller  ok
    @Test
    public void test() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/user/insert")).andReturn();
        MockHttpServletRequest request = result.getRequest();
        UserPO userVo = (UserPO) request.getAttribute("user");
        System.out.println(userVo);
        
    }

}
