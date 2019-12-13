package com.ngyb.googleplayserver.servlet;

import com.ngyb.googleplayserver.configure.MyConfiguration;
import com.ngyb.googleplayserver.utils.PropertiesUtils;
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
 * 日期：2019/12/3 16:42
 */
@RestController
@RequestMapping(value = "/AppServlet")
public class AppServlet {

    @Autowired
    MyConfiguration myConfiguration;

    @RequestMapping(value = "/app",produces = "application/json;charset=UTF-8")
    public String app(@RequestParam("index") String indexStr) throws IOException {
        String path1 = myConfiguration.getDir() + "/" + "WebInfos/app/applist1";
        String path2 = myConfiguration.getDir() + "/" + "WebInfos/app/applist2";
        String path3 = myConfiguration.getDir() + "/" + "WebInfos/app/applist3";
        String path = null;
        int index = (Integer.valueOf(indexStr) / 20) % 3;
        if (index == 0) {
            path = path1;
        } else if (index == 1) {
            path = path2;
        } else {
            path = path3;
        }
        File file = new File(path);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        FileInputStream stream = new FileInputStream(file);
        int count = -1;
        byte[] buffer = new byte[1024];
        while ((count = stream.read(buffer)) != -1) {
            baos.write(buffer, 0, count);
        }
        baos.close();
        stream.close();
        return baos.toString();
    }
}
