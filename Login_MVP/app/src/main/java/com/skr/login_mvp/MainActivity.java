package com.skr.login_mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.skr.login_mvp.presenter.LoginPresenter;
import com.skr.login_mvp.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {

    private TextView et_login_name;
    private TextView et_login_pwd;
    private Button btn_login;
    private Button btn_regist;
    private String name;
    private String pwd;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_login_name = findViewById(R.id.et_login_name);
        et_login_pwd = findViewById(R.id.et_login_pwd);
        btn_login = findViewById(R.id.btn_login);
        btn_regist = findViewById(R.id.btn_regist);

        name = et_login_name.getText().toString();
        pwd = et_login_pwd.getText().toString();
        //初始化persenter
        loginPresenter = new LoginPresenter(this);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name.isEmpty()&&!pwd.isEmpty()){
                    loginPresenter.loginPre(name,pwd);
                }
            }
        });

    }

    @Override
    public void showMsg(String msg) {
        
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hiddenLoading() {

    }

    @Override
    public void jumpActivity() {
        Log.i("", "jumpActivity: ");
    }
}
