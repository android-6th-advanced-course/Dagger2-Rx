package com.example.rathana.mvp_dagger2_demo.di.module;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.rathana.mvp_dagger2_demo.data.UserPreference;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PreferenceModule {

    private Application mApplication;

    public PreferenceModule(Application mApplication) {
        this.mApplication=mApplication;
    }

    @Provides
    @Singleton
    public Context provideActivity(){
        return mApplication;

    }

    @Provides
    @Singleton
    public  Application provideApplication(){
        return mApplication;
    }

    @Provides
    @Singleton
    public UserPreference provideUserPreference(Context context){
        return new UserPreference(context);
    }
}

