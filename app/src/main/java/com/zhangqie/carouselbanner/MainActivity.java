package com.zhangqie.carouselbanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zhangqie.carouselbanner.ui.CustomBannerActivity;
import com.zhangqie.carouselbanner.ui.CustomViewPagerActivity;
import com.zhangqie.carouselbanner.ui.IndicatorPositionActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                startActivity(new Intent(MainActivity.this,CustomViewPagerActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(MainActivity.this,IndicatorPositionActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(MainActivity.this,CustomBannerActivity.class));
                break;


        }
    }
}
