package com.example.rathana.mvp_dagger2_demo.data.remote;

import com.example.rathana.mvp_dagger2_demo.model.CategoryResponse;

import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed;
import retrofit2.http.GET;

public interface CategoryService {

    @GET("/api/v1/categories")
    Observable<CategoryResponse> getCategory();
}
