package com.example.rathana.mvp_dagger2_demo.di.component;

import com.example.rathana.mvp_dagger2_demo.data.remote.CategoryService;
import com.example.rathana.mvp_dagger2_demo.di.module.RetrofitModule;
import com.example.rathana.mvp_dagger2_demo.ui.MainActivity;
import com.example.rathana.mvp_dagger2_demo.di.module.ActivityModule;
import com.example.rathana.mvp_dagger2_demo.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = {ActivityModule.class,RetrofitModule.class},
dependencies = {AppComponent.class})
public interface ActivityComponent {

    void  inject(MainActivity activity);

    CategoryService getCategoryService();
}
