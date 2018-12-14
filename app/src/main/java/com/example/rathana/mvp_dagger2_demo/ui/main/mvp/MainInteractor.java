package com.example.rathana.mvp_dagger2_demo.ui.main.mvp;

import com.example.rathana.mvp_dagger2_demo.data.remote.CategoryService;
import com.example.rathana.mvp_dagger2_demo.model.CategoryResponse;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class MainInteractor implements Mvp.Interactor {


    CategoryService service;
    @Inject
    public MainInteractor(CategoryService service){
        this.service=service;
    }
    @Override
    public void getCategory(final InteractorCallback<CategoryResponse> callback) {
        //Rx
        final List<CategoryResponse> list=new ArrayList<>();
        service.getCategory().observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<CategoryResponse>() {

                    @Override
                    public void onComplete() {
                        callback.onSuccess(list);
                    }

                    @Override
                    public void onNext(CategoryResponse categoryResponse) {
                        list.add(categoryResponse);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(e.toString());
                    }
                });

    }
}
