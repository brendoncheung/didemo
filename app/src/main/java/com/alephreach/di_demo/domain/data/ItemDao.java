package com.alephreach.di_demo.domain.data;

import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface ItemDao {

    @Query("SELECT * FROM item")
    List<Item> getAllItem();

    @Insert
    void allItem(Item item);
}
