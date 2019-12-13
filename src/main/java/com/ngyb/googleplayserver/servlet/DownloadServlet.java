package com.ngyb.googleplayserver.servlet;

import com.ngyb.googleplayserver.configure.MyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2019/12/3 16:38
 */
@RestController
@RequestMapping(value = "/DownloadServlet")
public class DownloadServlet {

    @Autowired
    MyConfiguration myConfiguration;

    @RequestMapping(value ="/download")
    public void download(@RequestParam("name") String name,@RequestParam("range") String range, HttpServletResponse resp) throws IOException {
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.setCharacterEncoding("UTF-8");
        String path = myConfiguration.getDir() + "/" + "WebInfos/" + name;
        File file = new File(path);
        long length = file.length();
        resp.setContentLength((int) length);
        OutputStream out = resp.getOutputStream();
        if (range == null || "".equals(range.trim())) {
            FileInputStream stream = new FileInputStream(file);
            int count = -1;
            byte[] buffer = new byte[1024];
            while ((count = stream.read(buffer)) != -1) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                out.write(buffer, 0, count);
                out.flush();
            }
            stream.close();
            out.close();
        } else {
            try {
                FileInputStream stream = new FileInputStream(file);
                stream.skip(Long.valueOf(range));
                int count = -1;
                byte[] buffer = new byte[1024];
                while ((count = stream.read(buffer)) != -1) {
                    System.out.println("@@@2");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    out.write(buffer, 0, count);
                }
                stream.close();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
