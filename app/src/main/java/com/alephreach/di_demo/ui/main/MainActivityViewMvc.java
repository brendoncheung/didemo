package com.alephreach.di_demo.ui.main;

import android.view.View;

import com.alephreach.di_demo.domain.data.Item;

import java.util.List;

public interface MainActivityViewMvc {

    void bindData(List<Item> itemList);
    void showLoadingIndicator();
    void hideLoadingIndicator();

    View getRootView();

}
