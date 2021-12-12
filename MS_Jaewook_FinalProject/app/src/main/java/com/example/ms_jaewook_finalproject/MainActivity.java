package com.example.ms_jaewook_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView myRecyclerView;
    private RecyclerView.LayoutManager myLayoutManager;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);


        ArrayList<Product> productsInfo = new ArrayList<>();
        productsInfo.add(new Product(R.drawable.goodone, R.drawable.kingone, "멋쟁이 옷", "입기만 해도 멋쟁이가 됩니다.", 100000));
        productsInfo.add(new Product(R.drawable.goodtwo, R.drawable.kingtwo, "이쁜이 옷 ", "입기만 해도 이쁜이가 됩니다.", 100000));
        productsInfo.add(new Product(R.drawable.goodthree, R.drawable.kingthree, "훌륭한 옷 ", "입기만 해도 훌륭해집니다.", 100000));
        productsInfo.add(new Product(R.drawable.nicecoat, R.drawable.kingfour, "신기한 옷", "입기만 해도 신기해집니다.", 100000));
        productsInfo.add(new Product(R.drawable.niceone, R.drawable.kingfive, "놀라운 옷", "입기만 해도 놀라워집니다.", 100000));
        productsInfo.add(new Product(R.drawable.nicetwo, R.drawable.kingsix, "와우 옷", "입기만 해도 와우", 100000));
        productsInfo.add(new Product(R.drawable.nicethree, R.drawable.kingseven, "브라보 옷 ", "입기만 해도 브라보", 100000));
        productsInfo.add(new Product(R.drawable.wowone, R.drawable.kingone, "뷰티풀 옷 ", "입기만 해도 뷰티풀", 100000));
        productsInfo.add(new Product(R.drawable.wowtwo, R.drawable.kingtwo, "신비한 옷", "입기만 해도 신비합니다.", 100000));
        productsInfo.add(new Product(R.drawable.wowthree, R.drawable.kingten, "댄디한 옷 ", "입기만 해도 댄디합니다.", 100000));

        MyAdapter myAdapter = new MyAdapter(productsInfo);
        myRecyclerView.setAdapter(myAdapter);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Contact.class);
                startActivity(intent);
            }
        });

    }
}