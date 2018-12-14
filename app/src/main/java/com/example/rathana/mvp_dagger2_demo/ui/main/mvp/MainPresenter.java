package com.example.rathana.mvp_dagger2_demo.ui.main.mvp;

import com.example.rathana.mvp_dagger2_demo.model.CategoryResponse;

import java.util.List;

import javax.inject.Inject;

public class MainPresenter implements Mvp.Presenter {

    private Mvp.View view;
    private MainInteractor interactor;

    @Inject
    MainPresenter(MainInteractor interactor){
        this.interactor=interactor;
    }

    @Override
    public void setView(Mvp.View view) {
        this.view=view;
    }

    @Override
    public void getCategory() {
        interactor.getCategory(new Mvp.Interactor.InteractorCallback<CategoryResponse>() {
            @Override
            public void onSuccess(List<CategoryResponse> list) {
                if(view!=null)
                    view.onSuccess(list);
            }

            @Override
            public void onError(String error) {

            }
        });
    }
}
