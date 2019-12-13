package com.ngyb.googleplayserver.servlet;

import com.ngyb.googleplayserver.configure.MyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2019/12/3 16:31
 */
@RestController
@RequestMapping(value = "/ImageServlet")
public class ImageServlet {
    @Autowired
    MyConfiguration myConfiguration;

    @RequestMapping(value="/image")
    public void image(@RequestParam("name") String name, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String path = myConfiguration.getDir() + "/" + "WebInfos/" + name;
        File file = new File(path);
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.setCharacterEncoding("UTF-8");
        long length = file.length();
        resp.setContentLength((int) length);
        resp.setContentType("image/jpeg");
        OutputStream out = resp.getOutputStream();
        FileInputStream stream = new FileInputStream(file);
        int count = -1;
        byte[] buffer = new byte[1024];
        while ((count = stream.read(buffer)) != -1) {
            out.write(buffer, 0, count);
            out.flush();
        }
        stream.close();
        out.close();
    }
}
