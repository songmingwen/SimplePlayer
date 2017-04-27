package com.song.simpleplayer;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.song.simplevideolibrary.SimplePlayer;

/**
 * Created by Song on 2017/4/27 0027.
 * E-mail: z53520@qq.com
 */

public class MainActivity extends Activity {

    private SimplePlayer mSimplePlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSimplePlayer = (SimplePlayer) findViewById(R.id.simple_player);
//        mSimplePlayer.setTitle("美食—教你做蛋糕");
//        mSimplePlayer.play("http://ips.ifeng.com/video19.ifeng.com/video09/2016/07/25/34595-102-009-0533.mp4");
        mSimplePlayer.setTitle("cctv-6");
        mSimplePlayer.play("http://ivi.bupt.edu.cn/hls/cctv6hd.m3u8");
        mSimplePlayer.live(true);
        mSimplePlayer.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mSimplePlayer != null) {
            mSimplePlayer.onResume();
        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        if (mSimplePlayer != null) {
            mSimplePlayer.onPause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mSimplePlayer != null) {
            mSimplePlayer.onDestroy();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (mSimplePlayer != null) {
            mSimplePlayer.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public void onBackPressed() {
        if (mSimplePlayer != null && mSimplePlayer.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }
}
