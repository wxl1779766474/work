package com.test;

import com.pojo.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void registUser() {
      userService.registUser(new User(null,"bbj168","666666","bbj@168.com","17302214829"));
      userService.registUser(new User(null,"abc168","666666","abc@168.com","17302214829"));

    }
    @Test
    public void existsUsername() {
      if (userService.existsUsername("wxl2")){
        System.out.println("用户名已存在");
      }else {
        System.out.println("用户名可用");
      }

    }
}

