package com.xz.map;

import android.app.Application;
import android.content.Context;

/**
 * Created by xz on 2017/8/10 0010.
 */

public class App extends Application{
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext=getApplicationContext();
    }
}
