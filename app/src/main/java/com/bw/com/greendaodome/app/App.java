package com.bw.com.greendaodome.app;

import android.app.Application;

import com.bw.com.greendaodome.utils.GreendaoUtils;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        GreendaoUtils.getInstance().initGreenDao(this) ;
    }
}
