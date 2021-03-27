package com.example.android.kilofarms;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "product-table")

public class Products {
    @PrimaryKey(autoGenerate= true)
    private int user_id;
    @NonNull
    @ColumnInfo(name = "product")
    private String pName;
    public Products(@NonNull String word) {this.pName = word;}
    public String getWord(){return this.pName;}
}
