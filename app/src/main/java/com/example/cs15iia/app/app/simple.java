package com.example.cs15iia.app.app;
import android.app.Application;

import com.example.cs15iia.app.realm.module.SimpleRealmModule;

import io.realm.Realm;
import io.realm.RealmConfiguration;
/**
 * Created by cs15iia on 19/03/2018.
 */
public class simple extends Application {

    private static simple instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        RealmConfiguration config = new RealmConfiguration.Builder(getApplicationContext()).setModules(new SimpleRealmModule()).build();
        Realm.setDefaultConfiguration(config);
    }

    public static simple getInstance() {
        return instance;
    }
}