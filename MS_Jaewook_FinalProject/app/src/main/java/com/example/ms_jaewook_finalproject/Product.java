package com.example.ms_jaewook_finalproject;
public class Product {
    String product_name;
    int image_id1;
    int image_id2;
    int price;
    String product_explain;

    public Product(int image_id1,int image_id2,String product_name,String product_explain,int price) {
        this.product_name=product_name;
        this.product_explain =product_explain;
        this.image_id1 =image_id1;
        this.image_id2 = image_id2;
        this.price = price;

    }

    public String getProduct_name(){
        return product_name;
    }
    public String getProduct_explain(){
        return product_explain;
    }
    public int getImage_id1(){
        return image_id1;
    }
    public int getImage_id2(){
        return image_id2;
    }
    public int getPrice(){
        return price;
    }

}