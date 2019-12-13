package com.ngyb.googleplayserver.servlet;

import com.ngyb.googleplayserver.configure.MyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2019/12/3 16:00
 */
@RestController
@RequestMapping(value = "/UserServlet")
public class UserServlet {

    @Autowired
    MyConfiguration myConfiguration;

    @RequestMapping(value="/user")
    public String user(){
        System.out.println(myConfiguration.getDir());
        return "天道酬勤";
    }
}
