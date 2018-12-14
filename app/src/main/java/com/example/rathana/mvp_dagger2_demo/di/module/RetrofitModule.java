package com.example.rathana.mvp_dagger2_demo.di.module;

import com.example.rathana.mvp_dagger2_demo.data.remote.CategoryService;
import com.example.rathana.mvp_dagger2_demo.di.scope.ActivityScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RetrofitModule {

    @Provides
    @ActivityScope
    public Retrofit provideRetrofit(){
        return new Retrofit.Builder().baseUrl("http://110.74.194.125:15000")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create()).build();
    }

    @Provides
    @ActivityScope
    public CategoryService provideCategoryService(Retrofit retrofit){
        return retrofit.create(CategoryService.class);
    }


}
