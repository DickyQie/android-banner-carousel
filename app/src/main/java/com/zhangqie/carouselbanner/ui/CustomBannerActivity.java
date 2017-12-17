package com.zhangqie.carouselbanner.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.youth.banner.Banner;
import com.zhangqie.carouselbanner.R;
import com.zhangqie.carouselbanner.util.GlideImageLoader;
import com.zhangqie.carouselbanner.util.Util;

public class CustomBannerActivity extends AppCompatActivity {
    Banner banner1,banner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_banner);
        banner1 = (Banner) findViewById(R.id.banner1);
        banner2 = (Banner) findViewById(R.id.banner2);
        banner1.setImages(Util.showListImgUrl())
                .setImageLoader(new GlideImageLoader())
                .start();
        banner2.setImages(Util.showListImgUrl())
                .setImageLoader(new GlideImageLoader())
                .start();
    }
}
