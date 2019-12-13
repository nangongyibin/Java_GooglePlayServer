package com.ngyb.googleplayserver.servlet;

import com.google.gson.Gson;
import com.ngyb.googleplayserver.bean.CategoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2019/12/3 16:41
 */
@RestController
@RequestMapping(value = "/CategoryServlet")
public class CategoryServlet {

    @RequestMapping(value = "/category",produces = "application/json;charset=UTF-8")
    public String category() throws IOException {
        ArrayList<CategoryBean> categoryBeans = new ArrayList<>();
        CategoryBean categoryBean = new CategoryBean();
        categoryBean.setTitle("游戏");
        ArrayList<CategoryBean.InfosBean> infosBeans = new ArrayList<>();
        CategoryBean.InfosBean infosBean = new CategoryBean.InfosBean();
        infosBean.setName1("休闲");
        infosBean.setName2("棋牌");
        infosBean.setName3("益智");
        infosBean.setUrl1("image/category_game_0.jpg");
        infosBean.setUrl2("image/category_game_1.jpg");
        infosBean.setUrl3("image/category_game_2.jpg");
        infosBeans.add(infosBean);

        CategoryBean.InfosBean infosBean1 = new CategoryBean.InfosBean();
        infosBean1.setName1("射击");
        infosBean1.setName2("体育");
        infosBean1.setName3("儿童");
        infosBean1.setUrl1("image/category_game_3.jpg");
        infosBean1.setUrl2("image/category_game_4.jpg");
        infosBean1.setUrl3("image/category_game_5.jpg");
        infosBeans.add(infosBean1);

        CategoryBean.InfosBean infosBean2 = new CategoryBean.InfosBean();
        infosBean2.setName1("网游");
        infosBean2.setName2("角色");
        infosBean2.setName3("策略");
        infosBean2.setUrl1("image/category_game_6.jpg");
        infosBean2.setUrl2("image/category_game_7.jpg");
        infosBean2.setUrl3("image/category_game_8.jpg");
        infosBeans.add(infosBean2);

        CategoryBean.InfosBean infosBean3 = new CategoryBean.InfosBean();
        infosBean3.setName1("经营");
        infosBean3.setName2("竞速");
        infosBean3.setName3("");
        infosBean3.setUrl1("image/category_game_9.jpg");
        infosBean3.setUrl2("image/category_game_10.jpg");
        infosBean3.setUrl3("");
        infosBeans.add(infosBean3);

        categoryBean.setInfos(infosBeans);
        categoryBeans.add(categoryBean);

        CategoryBean categoryBean1 = new CategoryBean();
        categoryBean1.setTitle("应用");
        ArrayList<CategoryBean.InfosBean> infosBeans1 = new ArrayList<>();
        CategoryBean.InfosBean infosBean10 = new CategoryBean.InfosBean();
        infosBean10.setName1("浏览器");
        infosBean10.setName2("输入法");
        infosBean10.setName3("健康");
        infosBean10.setUrl1("image/category_app_0.jpg");
        infosBean10.setUrl2("image/category_app_1.jpg");
        infosBean10.setUrl3("image/category_app_2.jpg");
        infosBeans1.add(infosBean10);

        CategoryBean.InfosBean infosBean11 = new CategoryBean.InfosBean();
        infosBean11.setName1("效率");
        infosBean11.setName2("教育");
        infosBean11.setName3("理财");
        infosBean11.setUrl1("image/category_app_3.jpg");
        infosBean11.setUrl2("image/category_app_4.jpg");
        infosBean11.setUrl3("image/category_app_5.jpg");
        infosBeans1.add(infosBean11);

        CategoryBean.InfosBean infosBean12 = new CategoryBean.InfosBean();
        infosBean12.setName1("阅读");
        infosBean12.setName2("个性化");
        infosBean12.setName3("购物");
        infosBean12.setUrl1("image/category_app_6.jpg");
        infosBean12.setUrl2("image/category_app_7.jpg");
        infosBean12.setUrl3("image/category_app_8.jpg");
        infosBeans1.add(infosBean12);

        CategoryBean.InfosBean infosBean13 = new CategoryBean.InfosBean();
        infosBean13.setName1("资讯");
        infosBean13.setName2("生活");
        infosBean13.setName3("工具");
        infosBean13.setUrl1("image/category_app_9.jpg");
        infosBean13.setUrl2("image/category_app_10.jpg");
        infosBean13.setUrl3("image/category_app_11.jpg");
        infosBeans1.add(infosBean13);

        CategoryBean.InfosBean infosBean14 = new CategoryBean.InfosBean();
        infosBean14.setName1("出行");
        infosBean14.setName2("通讯");
        infosBean14.setName3("拍照");
        infosBean14.setUrl1("image/category_app_12.jpg");
        infosBean14.setUrl2("image/category_app_13.jpg");
        infosBean14.setUrl3("image/category_app_14.jpg");
        infosBeans1.add(infosBean14);

        CategoryBean.InfosBean infosBean15 = new CategoryBean.InfosBean();
        infosBean15.setName1("社交");
        infosBean15.setName2("影音");
        infosBean15.setName3("安全");
        infosBean15.setUrl1("image/category_app_15.jpg");
        infosBean15.setUrl2("image/category_app_16.jpg");
        infosBean15.setUrl3("image/category_app_17.jpg");
        infosBeans1.add(infosBean15);

        categoryBean1.setInfos(infosBeans1);
        categoryBeans.add(categoryBean1);
        return new Gson().toJson(categoryBeans);
    }
}
