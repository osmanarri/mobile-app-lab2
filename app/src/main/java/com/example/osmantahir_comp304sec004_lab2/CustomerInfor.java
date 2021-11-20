package com.example.osmantahir_comp304sec004_lab2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CustomerInfor extends AppCompatActivity {

    Button btninfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_infor);

        // Action bar
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Your Information");

        Intent intent = getIntent();

        String messageRegData = intent.getStringExtra(PaymentOption.RegistrationData);  //Change Here #######################

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textViewRegData);
        textView.setText(messageRegData);

        btninfo = (Button) findViewById(R.id.goToConfirm);
        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openConfirmation();
            }
        });
    }
    public void openConfirmation(){

        Intent intent = new Intent(this, Confirmation.class);
        startActivity(intent);
    }
}