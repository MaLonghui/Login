package com.skr.login_mvp.model;

import android.util.Log;

import com.skr.login_mvp.network.MyTask;

public class LoginModel implements ILoginModel {


    @Override
    public void login(final String url,final String name,final String pwd, final ILoginCallBack loginCallBack) {
        new Runnable(){
            @Override
            public void run() {
                new MyTask<String>(url,name,pwd).setTaskListener(new MyTask.TaskListeners() {
                    @Override
                    public void result(String t) {
                       // Log.i("aa", "result: "+t);
                        if (t !=null){
                            loginCallBack.onStatus(t);
                        }else{
                            loginCallBack.onFtailed();
                        }
                    }
                }).execute();
            }
        }.run();
    }
}
