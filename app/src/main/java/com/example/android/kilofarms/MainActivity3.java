package com.example.android.kilofarms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity3 extends AppCompatActivity {
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);
        textViewResult = findViewById(R.id.textViewResult);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://cc2pruxs38.execute-api.us-east-1.amazonaws.com/staging/vegetables ")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PostmanApi postmanApi = retrofit.create(PostmanApi.class);
        Call<List<Post>> call = postmanApi.getPosts();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public  void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
           if (!response.isSuccessful()) {
              textViewResult.setText("Code:  " + response.code());
              return;
           }
           List<Post>  posts = response.body();

           for(Post post: posts){
               String content = " ";
               content += " PRODUCT NAME: " + post.getSkuName() + "\n";
               content += " USER ID: " + post.getUser_id() + "\n";
               content += " UNIT: " + post.getSkuUnit() + "\n";
               content+= " CATEGORY: " + post.getSkuCategory() + "\n\n";

 textViewResult.append(content);

           }
            }
            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                textViewResult.setText(t.getMessage());

            }

        });
    }
}