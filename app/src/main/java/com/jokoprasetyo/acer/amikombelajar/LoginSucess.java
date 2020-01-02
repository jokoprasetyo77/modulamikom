package com.jokoprasetyo.acer.amikombelajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginSucess<v> extends AppCompatActivity {

    private TextView tvuiux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sucess);
        tvuiux = findViewById(R.id.tvuiux);

        tvuiux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginSucess.this,ModulActivity.class));
                finish();
            }
        });
    }
}

