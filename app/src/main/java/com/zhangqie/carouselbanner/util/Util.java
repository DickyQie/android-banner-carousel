package com.zhangqie.carouselbanner.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangqie on 2017/10/16.
 */

public class Util {

    public static final List<String> showListImgUrl(){
        List<String> img=new ArrayList<>();
        img.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic1xjab4j30ci08cjrv.jpg");
        img.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic21363tj30ci08ct96.jpg");
        img.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic259ohaj30ci08c74r.jpg");
        img.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2b16zuj30ci08cwf4.jpg");
        img.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2e7vsaj30ci08cglz.jpg");
        return img;
    }

    public static final List<String> showListTitle(){
        List<String> titles=new ArrayList<>();
        titles.add("生命不是要超越别人，而是要超越自己。");
        titles.add("己所不欲，勿施于人。——孔子");
        titles.add("切切歆语");
        titles.add("购物大甩卖");
        titles.add("生命诚可贵");
        return titles;
    }

}
