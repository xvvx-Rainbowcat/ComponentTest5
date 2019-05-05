package com.example.modulelogin;

import android.content.Context;
import android.content.Intent;

import com.example.lib.ILoginService;

public class LoginService implements ILoginService {
    @Override
    public void launch (Context context, String extra) {
        Intent intent = new Intent(context,LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("extra_data",extra);
        context.startActivity(intent);
    }
}
