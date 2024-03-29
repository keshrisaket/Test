package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {

                SharedPreferences pref=getSharedPreferences("Login",MODE_PRIVATE);
                boolean check=pref.getBoolean("flag",false);

                Intent intent;

                if (check){
                    intent=new Intent(SplashActivity.this,MainActivity.class);
                }else {
                    intent=new Intent(SplashActivity.this,LoginActivity.class);
                }
                startActivity(intent);
                finish();
            }
        },5000);

    }
}