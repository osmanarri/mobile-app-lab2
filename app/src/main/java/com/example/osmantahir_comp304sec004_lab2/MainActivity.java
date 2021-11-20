package com.example.osmantahir_comp304sec004_lab2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Action bar
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Order Pizza App");

        btnMain = (Button) findViewById(R.id.button1);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSecondActivity();
            }
        });
    }

    public void openSecondActivity(){

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}