package com.ngyb.googleplayserver.servlet;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2019/12/3 16:33
 */
@RestController
@RequestMapping(value = "/HotServlet")
public class HotServlet {

    @RequestMapping(value = "/hot",produces = "application/json;charset=UTF-8")
    public String hot() throws IOException {
        List<String> lists = new ArrayList<>();
        lists.add("QQ");
        lists.add("视频");
        lists.add("放开那三国");
        lists.add("电子书");
        lists.add("酒店");
        lists.add("单机");
        lists.add("小说");
        lists.add("斗地主");
        lists.add("优酷");
        lists.add("网游");
        lists.add("WIFI万能钥匙");
        lists.add("播放器");
        lists.add("捕鱼达人2");
        lists.add("机票");
        lists.add("游戏");
        lists.add("熊出没之熊大快跑");
        lists.add("美图秀秀");
        lists.add("浏览器");
        lists.add("单机游戏");
        lists.add("我的世界");
        lists.add("电影电视");
        lists.add("QQ空间");
        lists.add("旅游");
        lists.add("免费游戏");
        lists.add("2048");
        lists.add("刀塔传奇");
        lists.add("壁纸");
        lists.add("节奏大师");
        lists.add("锁屏");
        lists.add("装机必备");
        lists.add("天天动听");
        lists.add("备份");
        lists.add("网盘");
        lists.add("海淘网");
        lists.add("大众点评");
        lists.add("爱奇艺视频");
        lists.add("腾讯手机管家");
        lists.add("百度地图");
        lists.add("猎豹清理大师");
        lists.add("谷歌地图");
        lists.add("hao123上网导航");
        lists.add("京东");
        lists.add("youni有你");
        lists.add("万年历-农历黄历");
        lists.add("支付宝钱包");
        return  new Gson().toJson(lists);
    }
}
