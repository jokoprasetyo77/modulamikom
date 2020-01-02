package com.jokoprasetyo.acer.amikombelajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ModulActivity extends AppCompatActivity {

    private TextView tvmodul;
    private TextView tvback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul);
        tvmodul = findViewById(R.id.tvmodul1);
        tvback = findViewById(R.id.tvback);


        tvmodul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ModulActivity.this,ModulView1.class));
                finish();
            }
        });
        tvback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ModulActivity.this,LoginSucess.class));
                finish();
            }
        });
    }
}
