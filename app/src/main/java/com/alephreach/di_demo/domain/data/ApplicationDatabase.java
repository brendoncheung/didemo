package com.alephreach.di_demo.domain.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Item.class}, version = 1)
public abstract class ApplicationDatabase extends RoomDatabase {
    public abstract ItemDao itemDao();
}
