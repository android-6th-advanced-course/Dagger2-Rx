package com.example.rathana.mvp_dagger2_demo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.rathana.mvp_dagger2_demo.di.MyApp;
import com.example.rathana.mvp_dagger2_demo.di.component.ActivityComponent;
import com.example.rathana.mvp_dagger2_demo.di.component.DaggerActivityComponent;
import com.example.rathana.mvp_dagger2_demo.di.module.ActivityModule;

public abstract class AbsActivity extends AppCompatActivity {

    protected ActivityComponent mComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       mComponent=DaggerActivityComponent.builder()
                .appComponent(((MyApp) getApplication()).getComponent())
                .activityModule(new ActivityModule(this))
                .build();

    }
}
