package com.ngyb.googleplayserver.servlet;

import com.ngyb.googleplayserver.configure.MyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2019/12/3 16:35
 */
@RestController
@RequestMapping(value = "/HomeServlet")
public class HomeServlet {

    @Autowired
    MyConfiguration myConfiguration;

    @RequestMapping(value = "/home",produces = "application/json;charset=UTF-8")
    public String home(@RequestParam("index") String indexStr) throws IOException {
        String path0 = myConfiguration.getDir() + "/" + "WebInfos/app/homelist0";
        String path1 = myConfiguration.getDir() + "/" + "WebInfos/app/homelist1";
        String path2 = myConfiguration.getDir() + "/" + "WebInfos/app/homelist2";
        String path3 = myConfiguration.getDir() + "/" + "WebInfos/app/homelist3";
        String path = null;
        int index = Integer.valueOf(indexStr);
        if (index == 0) {
            path = path0;
        } else {
            index = (index / 20) % 3;
            if (index == 0) {
                path = path1;
            } else if (index == 1) {
                path = path2;
            } else {
                path = path3;
            }
        }
        File file = new File(path);
        FileInputStream stream = new FileInputStream(file);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int count = -1;
        byte[] buffer = new byte[1024];
        while ((count = stream.read(buffer)) != -1) {
            baos.write(buffer, 0, count);
        }
        stream.close();
        baos.close();
        return baos.toString();
    }
}
