package com.example.rathana.mvp_dagger2_demo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.rathana.mvp_dagger2_demo.R;
import com.example.rathana.mvp_dagger2_demo.base.AbsActivity;
import com.example.rathana.mvp_dagger2_demo.data.UserPreference;
import com.example.rathana.mvp_dagger2_demo.di.MyApp;
import com.example.rathana.mvp_dagger2_demo.model.CategoryResponse;
import com.example.rathana.mvp_dagger2_demo.ui.main.mvp.MainPresenter;
import com.example.rathana.mvp_dagger2_demo.ui.main.mvp.Mvp;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AbsActivity
implements Mvp.View<CategoryResponse> {

    @Inject
    MainPresenter presenter;

    private static final String TAG = "MainActivity";
    @Inject
    UserPreference userPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mComponent.inject(this);
        presenter.setView(this);

        Log.e(TAG, "onCreate: "+userPreference.get().toString());
    }


    @Override
    public void onSuccess(List<CategoryResponse> data) {
        Log.e(TAG, "onSuccess: "+data.toString() );
    }

    @Override
    public void onError(String error) {


    }
}
