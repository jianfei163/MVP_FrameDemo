package com.example.jianfei.mvp_framedemo.view;

import java.util.List;


public interface IView {
    void showLoading();
    void showData(List<String> list);
    void showErrorInfo(String string);
}
