package com.example.ms_jaewook_finalproject;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView myPicture;
        TextView myText;

        MyViewHolder(View view){
            super(view);
            myPicture = view.findViewById(R.id.imageView);
            myText = view.findViewById(R.id.textView);
        }
    }

    private ArrayList<Product> myProductList;

    MyAdapter(ArrayList<Product> products){
        this.myProductList = products;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, final int position) {

        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.myPicture.setImageResource(myProductList.get(position).getImage_id1());
        myViewHolder.myText.setText(myProductList.get(position).getProduct_name());

        myViewHolder.myPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context.getApplicationContext(),ProductInfo.class);
                intent.putExtra("name",myProductList.get(position).getProduct_name());
                intent.putExtra("explain",myProductList.get(position).getProduct_explain());
                intent.putExtra("image_id1",myProductList.get(position).getImage_id1());
                intent.putExtra("image_id2",myProductList.get(position).getImage_id2());
                intent.putExtra("price",myProductList.get(position).getPrice());

                context.startActivity(intent);
            }
        });

    }



    @Override
    public int getItemCount(){
        return myProductList.size();
    }


}
