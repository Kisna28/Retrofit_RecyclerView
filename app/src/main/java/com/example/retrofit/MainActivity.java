package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ///photos
  public  static   String api="https://android-kotlin-fun-mars-server.appspot.com";
List<Usermodel>alluserlist;
RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RetrofitInstance.getInstance().apiInterface.getUsers().enqueue(new Callback<List<Usermodel>>() {
            @Override
            public void onResponse(Call<List<Usermodel>> call, Response<List<Usermodel>> response) {

               alluserlist=response.body();
               recyclerView.setAdapter(new UserAdapter(MainActivity.this,alluserlist));

            }

            @Override
            public void onFailure(Call<List<Usermodel>> call, Throwable t) {

            }
        });


    }
}