package com.test;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {
  UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername() {

      if(userDao.queryUserByUsername("wxl") == null){
        System.out.println("用户名可用！");
      }else {
        System.out.println("用户名已存在！");
      }
    }

    @Test
    public void queryUserByUsernameAndPassword() {
      if(userDao.queryUserByUsernameAndPassword("admin", "admin1") == null) {
        System.out.println("用户名或密码错误，登录失败");
      }else {
        System.out.println("查询成功");
      }
    }

    @Test
    public void saveUser() {userDao.saveUser(new User(null,"wxl","123456","wxl111@qq.com","17302214829"));
        }
}
