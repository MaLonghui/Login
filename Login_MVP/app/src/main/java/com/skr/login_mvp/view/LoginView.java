package com.skr.login_mvp.view;

public interface LoginView {
    void showMsg(String msg);
    void showLoading();
    void hiddenLoading();
    void jumpActivity();
}
