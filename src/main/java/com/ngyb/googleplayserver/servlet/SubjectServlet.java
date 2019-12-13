package com.ngyb.googleplayserver.servlet;

import com.google.gson.Gson;
import com.ngyb.googleplayserver.bean.SubjectBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2019/12/3 16:04
 */
@RestController
@RequestMapping(value = "/SubjectServlet")
public class SubjectServlet {

    @RequestMapping(value="/subject",produces = "application/json;charset=UTF-8")
    public String subject(@RequestParam("index") String indexStr) throws IOException {
        List<SubjectBean> beans = new ArrayList<>();
        if(indexStr!=null && !indexStr.equals("")) {
            int index = Integer.parseInt(indexStr);
            int label = index / 20;
            if (label==0) {
                beans.add(new SubjectBean("一周新锐游戏精", "image/recommend_01.jpg"));
                beans.add(new SubjectBean("文艺VS2B", "image/recommend_02.jpg"));
                beans.add(new SubjectBean("用户特权中心", "image/recommend_03.jpg"));
                beans.add(new SubjectBean("月度榜单-5月篇", "image/recommend_04.jpg"));
                beans.add(new SubjectBean("我要过六一", "image/recommend_05.jpg"));
                beans.add(new SubjectBean("有一种教育叫\"玩\"", "image/recommend_06.jpg"));
                beans.add(new SubjectBean("再不疯狂我们就老了", "image/recommend_07.jpg"));
                beans.add(new SubjectBean("5.1-放飞心情", "image/recommend_08.jpg"));
                beans.add(new SubjectBean("舌尖上的中国", "image/recommend_09.jpg"));
                beans.add(new SubjectBean("你好!我的英雄", "image/recommend_10.jpg"));
                beans.add(new SubjectBean("致那些丢不掉的记忆", "image/recommend_11.jpg"));
                beans.add(new SubjectBean("无\"三星\"不游戏", "image/recommend_12.jpg"));
                beans.add(new SubjectBean("爱创意，给生活加点\"料\"", "image/recommend_13.jpg"));
                beans.add(new SubjectBean("突破十面\"霾\"伏,还我小清新", "image/recommend_14.jpg"));
                beans.add(new SubjectBean("来自星星的你们", "image/recommend_15.jpg"));
                beans.add(new SubjectBean("聚焦海外,先发产品汇", "image/recommend_16.jpg"));
                beans.add(new SubjectBean("开学新装备,学霸出击!", "image/recommend_17.jpg"));
                beans.add(new SubjectBean("情人节浪漫攻略", "image/recommend_18.jpg"));
                beans.add(new SubjectBean("马上有一切", "image/recommend_19.jpg"));
                beans.add(new SubjectBean("年末贺岁之游戏派队", "image/recommend_20.jpg"));
            } else if (label==1) {
                beans.add(new SubjectBean("2013年度最佳应用", "image/recommend_21.jpg"));
                beans.add(new SubjectBean("2013年度最佳游戏", "image/recommend_22.jpg"));
                beans.add(new SubjectBean("小怪兽游戏集锦", "image/recommend_23.jpg"));
                beans.add(new SubjectBean("感恩节游戏合集", "image/recommend_24.jpg"));
                beans.add(new SubjectBean("史上最虐心游戏大盘点", "image/recommend_25.jpg"));
                beans.add(new SubjectBean("运动健身软件合集", "image/recommend_26.jpg"));
                beans.add(new SubjectBean("光棍不寂寞", "image/recommend_27.jpg"));
                beans.add(new SubjectBean("万圣节:鬼魅狂欢", "image/recommend_28.jpg"));
                beans.add(new SubjectBean("争当好奶爸", "image/recommend_29.jpg"));
                beans.add(new SubjectBean("2013上半年游戏精选", "image/recommend_30.jpg"));
                beans.add(new SubjectBean("金秋时节,话养生", "image/recommend_31.jpg"));
                beans.add(new SubjectBean("涨姿势益智答题游戏集", "image/recommend_32.jpg"));
                beans.add(new SubjectBean("安卓智能终端大赛", "image/recommend_33.jpg"));
                beans.add(new SubjectBean("歌声响不停", "image/recommend_34.jpg"));
                beans.add(new SubjectBean("玩转时尚", "image/recommend_35.jpg"));
                beans.add(new SubjectBean("主发泄暴爽游戏推荐", "image/recommend_36.jpg"));
                beans.add(new SubjectBean("雷人坑爹游戏大鉴赏", "image/recommend_37.jpg"));
                beans.add(new SubjectBean("预热国庆近期游戏精选", "image/recommend_38.jpg"));
                beans.add(new SubjectBean("小巧打飞机合集", "image/recommend_39.jpg"));
                beans.add(new SubjectBean("解谜100系列专辑", "image/recommend_40.jpg"));
            } else if (label==2) {
                beans.add(new SubjectBean("台球游戏精选", "image/recommend_41.jpg"));
                beans.add(new SubjectBean("GLU游戏精选", "image/recommend_42.jpg"));
                beans.add(new SubjectBean("游走在黄灯边缘的...", "image/recommend_43.jpg"));
                beans.add(new SubjectBean("开学倒计时", "image/recommend_44.jpg"));
                beans.add(new SubjectBean("电视应用专区", "image/recommend_45.jpg"));
                beans.add(new SubjectBean("商旅出行指南", "image/recommend_46.jpg"));
                beans.add(new SubjectBean("交友SNS", "image/recommend_47.jpg"));
                beans.add(new SubjectBean("GAMEVIL游戏合集", "image/recommend_48.jpg"));
                beans.add(new SubjectBean("\"增强\"虚拟现实游戏精选", "image/recommend_49.jpg"));
                beans.add(new SubjectBean("优秀地图导航大血拼", "image/recommend_50.jpg"));
                beans.add(new SubjectBean("屌丝必备", "image/recommend_51.jpg"));
                beans.add(new SubjectBean("纯中文经营类游戏精选", "image/recommend_52.jpg"));
                beans.add(new SubjectBean("奋斗:学海无涯", "image/recommend_53.jpg"));
                beans.add(new SubjectBean("激情逃亡跑酷合集", "image/recommend_54.jpg"));
                beans.add(new SubjectBean("unity引擎游戏精选", "image/recommend_55.jpg"));
                beans.add(new SubjectBean("Fire!劲爆打枪游戏", "image/recommend_56.jpg"));
                beans.add(new SubjectBean("飞利浦平板推荐专区", "image/recommend_57.jpg"));
                beans.add(new SubjectBean("益智解谜游戏合集", "image/recommend_58.jpg"));
                beans.add(new SubjectBean("爱机美化必备", "image/recommend_59.jpg"));
                beans.add(new SubjectBean("\"绳命\"在于运动", "image/recommend_60.jpg"));
            } else if (label==3) {
                beans.add(new SubjectBean("移动游戏", "image/recommend_61.jpg"));
                beans.add(new SubjectBean("动态壁纸-唯美风", "image/recommend_62.jpg"));
                beans.add(new SubjectBean("系统级玩机达人必备", "image/recommend_63.jpg"));
                beans.add(new SubjectBean("轻松一刻,休闲游戏", "image/recommend_64.jpg"));
                beans.add(new SubjectBean("C3游戏引擎专区", "image/recommend_65.jpg"));
                beans.add(new SubjectBean("汉化精品区", "image/recommend_66.jpg"));
                beans.add(new SubjectBean("经典RPG的逆袭", "image/recommend_67.jpg"));
                beans.add(new SubjectBean("新一轮塔防全场hold住", "image/recommend_68.jpg"));
                beans.add(new SubjectBean("上古魔幻游戏大搜罗", "image/recommend_69.jpg"));
                beans.add(new SubjectBean("浩瀚天空战个痛快", "image/recommend_70.jpg"));
                beans.add(new SubjectBean("天翼专区", "image/recommend_71.jpg"));
                beans.add(new SubjectBean("极限运动游戏合集", "image/recommend_72.jpg"));
                beans.add(new SubjectBean("新浪微博应用", "image/recommend_73.jpg"));
                beans.add(new SubjectBean("便捷生活小工具", "image/recommend_74.jpg"));
                beans.add(new SubjectBean("精品期刊", "image/recommend_75.jpg"));
                beans.add(new SubjectBean("平板应用必备", "image/recommend_76.jpg"));
                beans.add(new SubjectBean("谷歌应用大集合", "image/recommend_77.jpg"));
                beans.add(new SubjectBean("手机安全顾问", "image/recommend_78.jpg"));
            }
        }
        return new Gson().toJson(beans);
    }
}
