package com.example.latihandataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class DeliveryActivity extends AppCompatActivity implements View.OnClickListener {
    public Button btn_cancel;
    public TextView nama;
    public TextView alamat;
    public TextView pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        btn_cancel = findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(this);

        nama = findViewById(R.id.nama);
        alamat = findViewById(R.id.alamat);
        pesan = findViewById(R.id.pesan);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("nama");
        String adress = bundle.getString("alamat");
        String order = bundle.getString("pesan");
        nama.setText(name);
        alamat.setText(adress);
        pesan.setText(order);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cancel:
                Intent cancel = new Intent(DeliveryActivity.this, MainActivity.class);
                startActivity(cancel);
        }
    }
}
