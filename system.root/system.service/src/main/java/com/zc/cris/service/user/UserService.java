package com.zc.cris.service.user;

import com.zc.cris.dao.model.UserPO;

public interface UserService {
    
    void insertUser(UserPO user) throws Exception;
    
    UserPO getByMapper() throws Exception;

}
