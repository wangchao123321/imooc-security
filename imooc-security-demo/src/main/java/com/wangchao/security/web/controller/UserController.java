package com.wangchao.security.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.wangchao.security.dto.User;
import com.wangchao.security.dto.UserQueryCondition;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @JsonView(User.UserSimpleView.class)
    public List<User> query(UserQueryCondition userQueryCondition, Pageable pageable){

        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getSort());

        System.out.println(userQueryCondition.toString());
        List<User> users=new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @JsonView(User.UserDetailView.class)
    public User getInfo(@PathVariable(value = "id") String id){
        User user=new User();
        user.setUserName("tom");
        return user;
    }

}
