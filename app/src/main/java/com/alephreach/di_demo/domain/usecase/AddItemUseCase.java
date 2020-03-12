package com.alephreach.di_demo.domain.usecase;

import com.alephreach.di_demo.domain.data.Item;
import com.alephreach.di_demo.domain.data.ItemDao;

public class AddItemUseCase {

    private final ItemDao mItemDao;

    public AddItemUseCase(ItemDao dao) {
        mItemDao = dao;
    }

    public void execute(Item item) {
        mItemDao.allItem(item);
    }


}
