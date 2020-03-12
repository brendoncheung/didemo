package com.alephreach.di_demo.domain.data;

import androidx.annotation.InspectableProperty;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Item {

    @PrimaryKey
    private int mId;

    @ColumnInfo(name = "title")
    private final String mTitle;

    @ColumnInfo(name = "description")
    private final String mDesciption;

    public Item(String title, String desciption) {
        mTitle = title;
        mDesciption = desciption;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDesciption() {
        return mDesciption;
    }
}
