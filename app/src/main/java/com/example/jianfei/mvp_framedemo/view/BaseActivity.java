package com.example.jianfei.mvp_framedemo.view;

import android.app.Activity;
import android.os.Bundle;

import com.example.jianfei.mvp_framedemo.presenter.BasePresenter;



public abstract class BaseActivity<V, T extends BasePresenter<V>> extends Activity {
    public T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.attachView((V) this);
    }

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
