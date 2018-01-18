package com.example.jianfei.mvp_framedemo.presenter;

import java.lang.ref.WeakReference;


public class BasePresenter<T> {
    protected WeakReference<T> mViewRef;

    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    public void detachView() {
        mViewRef.clear();
    }
}
