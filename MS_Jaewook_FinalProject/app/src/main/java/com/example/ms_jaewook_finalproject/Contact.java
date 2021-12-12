package com.example.ms_jaewook_finalproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class Contact extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        Button email,call;
        email = (Button)findViewById(R.id.button3);
        call = (Button)findViewById(R.id.button4);

        email.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sendEmail("sjw9714@naver.com");
            }
        });

        call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calltoyou("01099999999");
            }
        });

    }


    protected void calltoyou(String num){
        String Phonenum = "tel:" + num;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(Phonenum));
        startActivity(intent);
    }
    protected void sendEmail(String email) {
        String[] TO = {email};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Final Email");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "blah~~");
        try {
            startActivity(Intent.createChooser(emailIntent, "이메일 보내기..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex)
        {
            Toast.makeText(Contact.this, "이메일 클라이언트가 없네요.", Toast.LENGTH_SHORT).show();
        }
    }
}