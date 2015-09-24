package com.gulu.onsight;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by Administrator on 2015/9/24.
 */
public class OnSightApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initialization();
    }


    private void initialization()
    {
        FacebookSdk.sdkInitialize(this);
    }
}
