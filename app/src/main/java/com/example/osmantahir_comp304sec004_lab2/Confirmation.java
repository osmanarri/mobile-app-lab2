package com.example.osmantahir_comp304sec004_lab2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmation extends AppCompatActivity {

    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

       // Action bar
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Order Confirmation");


        btnHome = (Button) findViewById(R.id.goHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openMain();
            }
        });
    }
    public void openMain(){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}