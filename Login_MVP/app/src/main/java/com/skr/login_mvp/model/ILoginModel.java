package com.skr.login_mvp.model;

public interface ILoginModel {
    public void login(String url,String name,String pwd,ILoginCallBack loginCallBack);

    //登陆的回调接口和回调方法
    interface ILoginCallBack{
        void onStatus(String data);
        void onFtailed();
    }
}

