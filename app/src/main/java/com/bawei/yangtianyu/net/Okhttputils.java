package com.bawei.yangtianyu.net;


import java.net.HttpURLConnection;

/*
 *@Auther:杨天宇
 *@Date: 2019/6/11
 *@Time:9:06
 *@Description:功能 * */public class Okhttputils {
    private static final Okhttputils ourInstance = new Okhttputils();

    public static Okhttputils getInstance() {
        return ourInstance;
    }

    private Okhttputils() {
        Okhttputils instance = Okhttputils.getInstance();
        HttpURLConnection.getFollowRedirects();


    }
}
