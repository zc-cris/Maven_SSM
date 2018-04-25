package com.zc.cris.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zc.cris.dao.mapper.UserPOMapper;
import com.zc.cris.dao.model.UserPO;
import com.zc.cris.service.user.UserService;

@Service
public class UserServiceImpl implements UserService{

    
    @Autowired
    private UserPOMapper userPOMapper;
    
    @Override
    public void insertUser(UserPO user) throws Exception {
        userPOMapper.insert(user);
    }
    
    @Override
    public UserPO getByMapper() {
        return userPOMapper.selectByPrimaryKey(1);
    }

}
