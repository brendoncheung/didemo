package com.alephreach.di_demo.domain.usecase;

import android.os.Parcel;

import com.alephreach.di_demo.domain.data.Item;
import com.alephreach.di_demo.domain.data.ItemDao;

import java.util.List;

public class GetAllItemsUseCase {

    private final ItemDao mItemDao;

    public GetAllItemsUseCase(ItemDao dao) {
        mItemDao = dao;
    }

    public List<Item> execute() {
        return mItemDao.getAllItem();
    }
}
