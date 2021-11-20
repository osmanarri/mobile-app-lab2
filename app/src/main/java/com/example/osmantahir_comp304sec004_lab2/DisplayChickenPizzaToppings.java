package com.example.osmantahir_comp304sec004_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayChickenPizzaToppings extends AppCompatActivity {

    private Button btnDisplay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_chicken_pizza_toppings);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String messageToppingType = "Chicken Caesar Pizza";  //Change Here #######################
        String messageToppingName = intent.getStringExtra(CanadianPizzaToppings.ToppingName);  //Change Here #######################


        // Capture the layout's TextView and set the string as its text
        TextView textView01 = findViewById(R.id.textViewToppingsType);
        textView01.setText(messageToppingType);

        // Capture the layout's TextView and set the string as its text
        TextView textView02 = findViewById(R.id.ToppingsNames);
        textView02.setText(messageToppingName);

        btnDisplay2 = (Button) findViewById(R.id.button4);
        btnDisplay2.setOnClickListener(new View.OnClickListener() {
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