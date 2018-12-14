package com.example.rathana.mvp_dagger2_demo.di;

import android.app.Application;

import com.example.rathana.mvp_dagger2_demo.data.UserPreference;
import com.example.rathana.mvp_dagger2_demo.di.component.AppComponent;
import com.example.rathana.mvp_dagger2_demo.di.component.DaggerAppComponent;
import com.example.rathana.mvp_dagger2_demo.di.module.PreferenceModule;

import javax.inject.Inject;

public class MyApp extends Application {

    private AppComponent mComponent;
    /*@Inject
    UserPreference userPreference;*/
    @Override
    public void onCreate() {
        super.onCreate();

        mComponent=DaggerAppComponent.builder()
                .preferenceModule(new PreferenceModule(this))
                .build();

        mComponent.inject(this);

    }

    public AppComponent getComponent(){
        return mComponent;
    }

}
