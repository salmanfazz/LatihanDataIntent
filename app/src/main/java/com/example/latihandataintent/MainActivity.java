package com.example.latihandataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public ImageView gofood;
    public ImageView gomart;
    public ImageView gosend;
    public ImageView goride;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gofood = (ImageView) findViewById(R.id.gofood);
        gofood.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent GoFood = new Intent(MainActivity.this, FoodActivity.class);
        startActivity(GoFood);
    }
}
