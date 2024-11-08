package com.social.controller;

import com.social.models.User;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {



    @GetMapping()
    public List<User> getAllUsers(){
        List<User> userList=new ArrayList<>();
        User user1=new User(100000, LocalDateTime.now(),null,"admin",null,"1001","Saima","Akter","saima@gmail.com","1234");
        User user2=new User(100000, LocalDateTime.now(),null,"admin",null,"1002","Rahima","Akter","rah@gmail.com","1234");
        userList.add(user1);
        userList.add(user2);
        return userList;
    }

    @GetMapping("/{xuserid}")
    public User getUserById(@PathVariable("xuserid") String xuserid){
        User user1=new User(100000, LocalDateTime.now(),null,"admin",null,"1001","Saima","Akter","saima@gmail.com","1234");
        user1.setXuserid(xuserid);

        return user1;
    }

    @PostMapping()
    public User createUser(@RequestBody User user){
        User newUser=new User();
        newUser.setZid(user.getZid());
        newUser.setZtime(user.getZtime());
        newUser.setZauserid(user.getZauserid());
        newUser.setXuserid(user.getXuserid());
        newUser.setXfirstName(user.getXfirstName());
        newUser.setXlastName(user.getXlastName());
        newUser.setXemail(user.getXemail());
        newUser.setXpassword(user.getXpassword());
        return newUser;
    }

    @PutMapping()
    public User updateUser(@RequestBody User user){
        User user1=new User(100000, LocalDateTime.now(),null,"admin",null,"1001","Saima","Akter","saima@gmail.com","1234");

        if(user.getXfirstName()!=null){
            user1.setXfirstName(user.getXfirstName());
        };
        if(user.getXlastName()!=null){
            user1.setXlastName(user.getXlastName());
        };

        if(user.getXemail()!=null){
            user1.setXemail(user.getXemail());
        };

        if(user.getXpassword()!=null){
            user1.setXpassword(user.getXpassword());
        };

        user1.setZutime(user.getZutime());
        return user1;
    }

    @DeleteMapping("/{userid}")
    public String deleteUser(@PathVariable String userid){
        return "User Deleted "+userid;
    }
}
