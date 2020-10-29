package com.web;

import com.pojo.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistServlet extends HttpServlet {

  private UserService userService = new UserServiceImpl();

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //1.获取请求的参数
    String username = req.getParameter("username");
    String password = req.getParameter("password");
    String email = req.getParameter("email");
    String phone =req.getParameter("phone");
//    2.检查用户名是否可用
      if (userService.existsUsername(username)) {
        System.out.println("用户名[" + username + "]已存在!");
//        跳回注册页面
        req.getRequestDispatcher("/page/user/regist.html").forward(req, resp);
      } else {
//        可用
//        调用service保存的数据库种
        userService.registUser(new User(null, username, password, email, phone));
//        跳到注册成功的页面regist_success.html
        req.getRequestDispatcher("/page/user/regist_success.html").forward(req, resp);
      }



  }
}
