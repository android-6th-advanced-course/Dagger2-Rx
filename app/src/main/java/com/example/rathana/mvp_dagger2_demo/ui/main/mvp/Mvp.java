package com.example.rathana.mvp_dagger2_demo.ui.main.mvp;

import com.example.rathana.mvp_dagger2_demo.model.CategoryResponse;

import java.util.List;

public interface Mvp  {
    interface View<T>{
        void onSuccess(List<T> data);
        void onError(String error);
    }
    interface Presenter{
        void setView(View view);
        void getCategory();
    }

    interface Interactor{
        void getCategory(InteractorCallback<CategoryResponse> callback);

        interface InteractorCallback<T>{
            void onSuccess(List<T> list);
            void onError(String error);
        }
    }

}
