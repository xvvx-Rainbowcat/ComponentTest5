package com.example.pc_96.componenttest5;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.lib.AppConfig;
import com.example.lib.IAppComponent;

public class BaseApp extends Application implements IAppComponent {
    @Override
    public void onCreate () {
        super.onCreate();
//        initialize(this);
        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }

    @Override
    public void initialize (Application app) {
        for(String component: AppConfig.COMPONENTS){
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if(object instanceof  IAppComponent){
                    ((IAppComponent) object).initialize(app);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
