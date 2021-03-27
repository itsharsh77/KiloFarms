package com.example.android.kilofarms;
import com.google.gson.annotations.SerializedName;
public class Post {

    private  String skuName;
    private int  user_id;;
    private String skuUnit;
    @SerializedName("body")
    private String  skuCategory;

    public String getSkuName() {
        return skuName;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getSkuUnit() {
        return skuUnit;
    }

    public String getSkuCategory() {
        return skuCategory;
    }
}
