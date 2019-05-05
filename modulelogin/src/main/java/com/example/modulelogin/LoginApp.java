package com.example.modulelogin;

import android.app.Application;

import com.example.lib.IAppComponent;
import com.example.lib.ServiceFactory;

public class LoginApp extends Application implements IAppComponent {
    @Override
    public void onCreate () {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize (Application app) {
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
