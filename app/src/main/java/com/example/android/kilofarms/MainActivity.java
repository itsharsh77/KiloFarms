package com.example.android.kilofarms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
EditText phone,name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        phone = findViewById(R.id.inputMobile);
    }
    public void openActivity(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        name = findViewById(R.id.inputUser);
        password = findViewById(R.id.inputPassword);
        startActivity(intent);
    }
}
