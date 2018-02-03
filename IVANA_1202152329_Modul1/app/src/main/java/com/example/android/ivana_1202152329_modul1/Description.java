package com.example.android.ivana_1202152329_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Description extends AppCompatActivity {

    TextView tvRestaurant, tvMenu, tvPortion, tvPrice;
    String restaurant,menu;
    int portion, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        tvRestaurant = (TextView)findViewById(R.id.tv_restaurant); //mengambil id dari xml
        tvMenu = (TextView)findViewById(R.id.tv_menu);
        tvPortion = (TextView)findViewById(R.id.tv_portion);
        tvPrice = (TextView)findViewById(R.id.tv_price);

        Intent intent = getIntent(); //mengambil data dari activity sebelumnya
        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        portion = intent.getIntExtra("portion", 0);
        price = intent.getIntExtra("price", 0);

        tvRestaurant.setText(restaurant); //untuk mengisi komponen dengan datanya
        tvMenu.setText(menu);
        tvPortion.setText(""+portion);
        tvPrice.setText("Rp."+price);

        Toast toast = null;
        if (price < 65000) {
            toast = Toast.makeText(getApplicationContext(), "Ayo makan sini aja!", Toast.LENGTH_SHORT); //getApplicationContext untuk mengetahui dimana activity sekarang berada
        } else {
            toast = Toast.makeText(getApplicationContext(), "Jangan makan disini, sayang. uang kamu tidak cukup", Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
