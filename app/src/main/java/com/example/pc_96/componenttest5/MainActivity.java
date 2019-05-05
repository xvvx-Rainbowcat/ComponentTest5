package com.example.pc_96.componenttest5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.lib.ServiceFactory;
@Route(path = "app/main/mainactivity")
public class MainActivity extends AppCompatActivity {
    private Button app_btn;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app_btn = findViewById(R.id.app_btn);
        app_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                ARouter.getInstance().build("/login/login/loginactivity").navigation();
//                ServiceFactory.getInstance().getLoginService().launch(MainActivity.this,null);
            }
        });
    }
}
