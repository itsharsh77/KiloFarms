package com.example.android.kilofarms;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

public class ProductDao {
    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Products user_id) {
    }
    @Query("DELETE FROM product_table")
    void deleteAll() {
    }
    @Query("SELECT * FROM product_table ORDER BY user_id ASC")
    LiveData<List<Products>> getAlphabetizedWords() {
        return null;
    }

}
