package com.zhangqie.carouselbanner.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;
import com.zhangqie.carouselbanner.R;
import com.zhangqie.carouselbanner.util.GlideImageLoader;
import com.zhangqie.carouselbanner.util.Util;


public class CustomViewPagerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener,OnBannerListener {
    Banner banner;
    Spinner spinnerStyle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_pager);

        banner = (Banner) findViewById(R.id.banner);
        spinnerStyle = (Spinner) findViewById(R.id.spinnerStyle);
        spinnerStyle.setOnItemSelectedListener(this);
        banner.setDelayTime(4000);
        //默认是CIRCLE_INDICATOR
        banner.setImages(Util.showListImgUrl())
                .setBannerTitles(Util.showListTitle())
                .setBannerStyle(BannerConfig.NOT_INDICATOR)
                .setImageLoader(new GlideImageLoader())
                .setOnBannerListener(this)
                .start();

    }
    @Override
    protected void onStop() {
        super.onStop();
        //结束轮播
        banner.stopAutoPlay();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                banner.updateBannerStyle(BannerConfig.NOT_INDICATOR);
                break;
            case 1:
                banner.updateBannerStyle(BannerConfig.CIRCLE_INDICATOR);
                break;
            case 2:
                banner.updateBannerStyle(BannerConfig.NUM_INDICATOR);
                break;
            case 3:
                banner.updateBannerStyle(BannerConfig.NUM_INDICATOR_TITLE);
                break;
            case 4:
                banner.updateBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
                break;
            case 5:
                banner.updateBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void OnBannerClick(int position) {
        Toast.makeText(getApplicationContext(),"你点击了："+position, Toast.LENGTH_SHORT).show();
    }
}
