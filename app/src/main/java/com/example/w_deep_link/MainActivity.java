package com.example.w_deep_link;
//1.maniFast設定屬性
//2.寫一個html網頁連結
//3.手機跟網頁網域相同用ip當url取代localHost,因為手機也有一個localHost
//4.按下連結即可跳出指定下載好的APP
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //取得intent的action
        Intent intent = getIntent();
        String action = intent.getAction();
        Log.v("hank","action:" +action);//action:android.intent.action.MAIN




    }
}
