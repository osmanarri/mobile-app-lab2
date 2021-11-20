package com.example.osmantahir_comp304sec004_lab2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayCanadianPizza extends AppCompatActivity {
    public TextView osman1;
    private Button btnDisplay1;
//    TextView totalForCheckout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_canadian_pizza);
//-----------------------------------------------
        // Action bar
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Your Pizza Toppins");

        //-----------------------------------------------

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String messageToppingType = "Canadian Pizza";  //Change Here #######################
        String messageToppingName = intent.getStringExtra(CanadianPizzaToppings.ToppingName);  //Change Here #######################
        String total = intent.getStringExtra("keyword");

        // Capture the layout's TextView and set the string as its text
        TextView textView01 = findViewById(R.id.textViewToppingsType);
        textView01.setText(messageToppingType);

        // Capture the layout's TextView and set the string as its text
        TextView textView02 = findViewById(R.id.ToppingsNames);
        textView02.setText(messageToppingName);

        osman1 = findViewById(R.id.osman);
        osman1.setText(total);

        btnDisplay1 = (Button) findViewById(R.id.button3);
        btnDisplay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSpinnersActivity();
            }
        });

    }
    public void openSpinnersActivity(){

        Intent intent = new Intent(this, SpinnersActivity.class);
        startActivity(intent);


    }
}