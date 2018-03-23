package com.zpj.myapplication11;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zpj on 2018/3/23 0023.
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();
    public static void addActivty(Activity activity) {
        activities.add(activity);
    }
    public static void removeActivity(Activity activity) {  //该方法用于从List中移除活动
        activities.remove(activity);
    }
    public static void finishAll() {  //该方法用于将List中的活动全部销毁掉
        for (Activity activity : activities) {
            if (!activity.isFinishing())
            activity.finish();
        }
    }

}
