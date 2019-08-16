package com.example.latihandataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FoodActivity extends AppCompatActivity implements View.OnClickListener {
    public EditText txt_nama;
    public EditText txt_alamat;
    public EditText txt_pesan;
    public Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        txt_nama = findViewById(R.id.txt_nama);
        txt_alamat = findViewById(R.id.txt_alamat);
        txt_pesan = findViewById(R.id.txt_pesan);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent order = new Intent(FoodActivity.this, DeliveryActivity.class);
        order.putExtra("nama", txt_nama.getText().toString());
        order.putExtra("alamat", txt_alamat.getText().toString());
        order.putExtra("pesan", txt_pesan.getText().toString());
        startActivity(order);
    }
}
