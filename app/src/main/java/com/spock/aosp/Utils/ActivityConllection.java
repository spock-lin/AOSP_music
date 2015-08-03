package com.spock.aosp.Utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by greden on 2015/7/26 0026.
 */
public class ActivityConllection {
    public static List<Activity> mActivityList=new ArrayList<Activity>();

    public static void addActivity(Activity activity){
        mActivityList.add(activity);
    }

    public static void removeActivity(Activity activity){
        mActivityList.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity: mActivityList){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
