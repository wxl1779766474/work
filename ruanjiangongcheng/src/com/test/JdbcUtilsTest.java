package com.test;

import com.utils.JdbcUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.sql.Connection;

public class JdbcUtilsTest {
  @Test
  public void testJdbcUtils(){
    for(int i=0;i<100;i++){
      Connection connection = JdbcUtils.getConnection();
      System.out.println(connection);
      JdbcUtils.close(connection);
    }
  }
}
