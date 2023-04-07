package com.zlfcappbase.update;
import android.app.Application;
import android.content.Context;

import com.blankj.utilcode.util.Utils;

/**
 * Created by ZhangBx on 2018/5/30.
 */

public class App extends Application{
    public static Context mContext;
    private static App app;


    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
