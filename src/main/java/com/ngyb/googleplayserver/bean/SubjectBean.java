package com.ngyb.googleplayserver.bean;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2019/12/3 16:53
 */
public class SubjectBean {

    /**
     * des : 一周新锐游戏精选
     * url : image/recommend_01.jpg
     */

    private String des;
    private String url;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SubjectBean(String des, String url) {
        this.des = des;
        this.url = url;
    }
}
