package com.skr.login_mvp.presenter;

import android.util.Log;

import com.skr.login_mvp.Api;
import com.skr.login_mvp.MainActivity;
import com.skr.login_mvp.model.ILoginModel;
import com.skr.login_mvp.model.LoginModel;

public class LoginPresenter implements ILoginPresenter{

    MainActivity mainActivity;
    private final LoginModel loginModel;

    public LoginPresenter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        loginModel = new LoginModel();
    }

    @Override
    public void loginPre(String name, String pwd) {
        loginModel.login(Api.LOGIN, name, pwd, new ILoginModel.ILoginCallBack() {
            @Override
            public void onStatus(String data) {
                Log.i("aa", "onStatus: "+data);
                mainActivity.jumpActivity();
            }

            @Override
            public void onFtailed() {

            }
        });
    }
}
