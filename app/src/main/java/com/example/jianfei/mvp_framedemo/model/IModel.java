package com.example.jianfei.mvp_framedemo.model;

import java.util.List;


public interface IModel {
    void loadData(String string, ModellOnLoadListener listener);

    interface ModellOnLoadListener {
        void onComplete(List<String> list);
        void onError(String error);
    }
}
