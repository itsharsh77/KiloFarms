package com.example.android.kilofarms;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostmanApi {
    @GET("posts")
    Call<List<Post>> getPosts();
}
