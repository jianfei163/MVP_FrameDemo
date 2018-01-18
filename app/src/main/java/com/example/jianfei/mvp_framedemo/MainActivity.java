package com.example.jianfei.mvp_framedemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jianfei.mvp_framedemo.presenter.ModelPresenter;
import com.example.jianfei.mvp_framedemo.view.BaseActivity;
import com.example.jianfei.mvp_framedemo.view.IView;

import java.util.List;

public class MainActivity extends BaseActivity<IView,ModelPresenter<IView>> implements IView {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        presenter.fetch("123");
    }

    @Override
    protected ModelPresenter<IView> createPresenter() {
        return new ModelPresenter<>();
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.listview);
    }

    @Override
    public void showLoading() {
    }

    @Override
    public void showData(List<String> list) {
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list));

    }

    @Override
    public void showErrorInfo(String string) {
    }
}
