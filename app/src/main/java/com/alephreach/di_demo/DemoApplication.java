package com.alephreach.di_demo;

import android.app.Application;

import androidx.room.Room;

import com.alephreach.di_demo.domain.data.ApplicationDatabase;

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationDatabase database = Room.databaseBuilder(getApplicationContext(),
                ApplicationDatabase.class,
                "database").build();
    }
}
