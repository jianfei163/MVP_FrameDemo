package com.example.jianfei.mvp_framedemo.model;

import java.util.ArrayList;


public class ModelImpl implements IModel {

    @Override
    public void loadData(String string, final ModellOnLoadListener listener) {
        if (string.equals("123")) {
            ArrayList<String> strings = new ArrayList<>();
            strings.add("1234");
            strings.add("555555");
            strings.add("8888888");
            strings.add("9999999");

            listener.onComplete(strings);

        } else {
            listener.onError("传值错误");
        }
    }
}
