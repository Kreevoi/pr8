package com.example.pr8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class product extends AppCompatActivity implements View.OnClickListener{

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product);
        Button btnphone = (Button) findViewById(R.id.btnphone);
        btnphone.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent j;
        j = new Intent(this, phone.class);
        startActivity(j);
    }
}