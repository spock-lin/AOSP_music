package com.spock.aosp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.spock.aosp.R;

import java.util.Timer;
import java.util.TimerTask;

import com.spock.aosp.Utils.BaseActivity;


public class Welcome extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.welcome);

        final Intent intent=new Intent(this,AllMusicActivity.class);
        Timer timer=new Timer();
        TimerTask mTimeTask=new TimerTask() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        };
        timer.schedule(mTimeTask,2000);
    }
}
