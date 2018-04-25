package com.zc.cris.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zc.cris.dao.model.UserPO;
import com.zc.cris.service.user.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("/insert")
    public String insert(Model model) {
        
        UserPO user = new UserPO();
        user.setUserAge(23);;
        user.setUserName("老二爹");
        
        try {
            userService.insertUser(user);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        model.addAttribute("user", user);
        return "user/test";
    }
}
