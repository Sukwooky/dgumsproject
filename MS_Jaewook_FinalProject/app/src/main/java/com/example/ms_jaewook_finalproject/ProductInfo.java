package com.example.ms_jaewook_finalproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductInfo extends AppCompatActivity {
    String pri;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectedproduct);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String explain = intent.getStringExtra("explain");
        int image_id1 = intent.getIntExtra("image_id1",0);
        int image_id2 = intent.getIntExtra("image_id2",0) ;
        int price = intent.getIntExtra("price",0);

        pri = Integer.toString(price);
        TextView v1, v2 ,v3;
        v1 = findViewById(R.id.name);
        v2 = findViewById(R.id.explain);
        v3 = findViewById(R.id.textView2);

        ImageView i1, i2;
        i1 = findViewById(R.id.imageView2);
        i2 = findViewById(R.id.imageView3);

        i1.setImageResource(image_id1);
        i2.setImageResource(image_id2);

        v1.setText(name);
        v2.setText(explain);
        v3.setText(pri);
    }

}
