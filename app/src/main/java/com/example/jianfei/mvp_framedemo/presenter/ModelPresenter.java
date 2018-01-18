package com.example.jianfei.mvp_framedemo.presenter;

import com.example.jianfei.mvp_framedemo.model.IModel;
import com.example.jianfei.mvp_framedemo.model.ModelImpl;
import com.example.jianfei.mvp_framedemo.view.IView;

import java.util.List;



public class ModelPresenter<T extends IView> extends BasePresenter<T> {
    //view层应用
//    IView iView;
    //model层应用
    IModel iModel = new ModelImpl();
    //构造方法
    public ModelPresenter() {

    }


    public void fetch(String string) {
        if (mViewRef.get() != null) {
            mViewRef.get().showLoading();
            if (iModel != null) {
                iModel.loadData(string, new IModel.ModellOnLoadListener() {
                    @Override
                    public void onComplete(List<String> list) {
                        if (mViewRef.get() != null) {
                            mViewRef.get().showData(list);
                        }
                    }

                    @Override
                    public void onError(String error) {
                        if (mViewRef.get() != null) {
                            mViewRef.get().showErrorInfo(error);
                        }
                    }
                });
            }
        }
    }
}
