package com.example.rathana.mvp_dagger2_demo.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.rathana.mvp_dagger2_demo.data.UserPreference;
import com.example.rathana.mvp_dagger2_demo.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

   @Provides
   @ActivityScope
   public Context provideContext(){
        return this.activity;
   }


   /*@Provides
   @ActivityScope
   public UserPreference provideUserPreference(Context context){
        return new UserPreference(context);
    }*/
}
