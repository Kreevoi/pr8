package com.example.pr8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class catalog extends AppCompatActivity implements View.OnClickListener {

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalog);
        Button btnresult = (Button) findViewById(R.id.btnresult);
        btnresult.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this, product.class);
        startActivity(i);
    }
}