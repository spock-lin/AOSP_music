package com.spock.aosp.Utils;

import android.app.Activity;
import android.os.Bundle;

import com.spock.aosp.Utils.ActivityConllection;

/**
 * Created by greden on 2015/7/26 0026.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityConllection.addActivity(this) ;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityConllection.removeActivity(this);
    }
}
