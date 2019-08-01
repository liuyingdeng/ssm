package com.dls.controls;

import com.dls.dao.UserDao;
import com.dls.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;
    @RequestMapping("/getuser/{username}&{password}")
    public @ResponseBody
    Boolean getUserByUsername(@PathVariable("username")String username,@PathVariable("password")String password){
        boolean result;
        User user = userDao.getUserByUsername(username);
        String pass = user.getPassword();
        if (pass.equals(password)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
