package com.example.rathana.mvp_dagger2_demo.di.component;

import android.app.Application;

import com.example.rathana.mvp_dagger2_demo.di.module.PreferenceModule;
import com.example.rathana.mvp_dagger2_demo.di.module.RetrofitModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {PreferenceModule.class,RetrofitModule.class})
public interface AppComponent {
    void inject(Application application);
    /*void inject(MainActivity activity);*/
}
