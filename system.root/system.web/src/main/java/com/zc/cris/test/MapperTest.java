package com.zc.cris.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zc.cris.dao.model.UserPO;
import com.zc.cris.service.user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/applicationContext.xml"})
public class MapperTest {

    @Autowired
    SqlSession sqlSession;
    @Autowired
    UserService userService;
    
    // 测试mybatis 的函数式接口 ok
    @Test
    public void test() {
//        System.out.println(userDao);
//        System.out.println(sqlSession);
//        userDao.insertUser(new UserVO("cris", 23));
    }
    
    // 测试批处理是否可以使用  ok
    @Test
    public void testBatch() {
//        UserDao userMapper = sqlSession.getMapper(UserDao.class);
//        for (int i = 0; i < 3; i++) {
//            userMapper.insertUser(new UserVO("cris"+i, i+23));
//            
//        }
    }
    
    // 测试通用 Mapper 插件是否可用 ok
    @Test
    public void testMapper() throws Exception {
        UserPO user = userService.getByMapper();
        System.out.println(user);
    }

}
