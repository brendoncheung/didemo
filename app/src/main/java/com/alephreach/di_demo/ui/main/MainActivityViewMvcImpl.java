package com.alephreach.di_demo.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alephreach.di_demo.R;
import com.alephreach.di_demo.domain.data.Item;

import java.util.List;

public class MainActivityViewMvcImpl implements MainActivityViewMvc {

    private View mRootView;

    private final MainActivityAdapter mMainActivityAdapter = new MainActivityAdapter();

    public MainActivityViewMvcImpl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        mRootView = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
    }

    @Override
    public void bindData(List<Item> itemList) {

    }

    @Override
    public void showLoadingIndicator() {

    }

    @Override
    public void hideLoadingIndicator() {

    }

    @Override
    public View getRootView() {
        return mRootView;
    }
}
