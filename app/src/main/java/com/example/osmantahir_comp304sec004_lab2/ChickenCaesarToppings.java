package com.example.osmantahir_comp304sec004_lab2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class ChickenCaesarToppings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_caesar_toppings);

        // Action bar
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Chicken Caesar Toppings");


    }

    public static final String ToppingName2 = "osmantahir_com304sec004_lab2.MESSAGE";

    /** Called when the user taps the "Next" button */
    public void goToDisplayChoiceA(View view) {    //Change Here
        Intent intent = new Intent(this, DisplayChickenPizzaToppings.class);  //Change Here

        String checkedToppingsName2 = "";

        CheckBox chkBxH1 = (CheckBox) findViewById(R.id.checkChickenCaesar);    //Change Here
        CheckBox chkBxH2 = (CheckBox) findViewById(R.id.checkOlives);    //Change Here
        CheckBox chkBxH3 = (CheckBox) findViewById(R.id.checkGreenPepper);    //Change Here
        CheckBox chkBxH4 = (CheckBox) findViewById(R.id.checkMozzarella);    //Change Here

        if (chkBxH1.isChecked()) {
            checkedToppingsName2 = checkedToppingsName2 + getString(R.string.Chicken_caesar) + "\n\n";
        }    //Change Here
        if (chkBxH2.isChecked()) {
            checkedToppingsName2 = checkedToppingsName2 + getString(R.string.Olives) + "\n\n";
        }    //Change Here
        if (chkBxH3.isChecked()) {
            checkedToppingsName2 = checkedToppingsName2 + getString(R.string.green_pepper) + "\n\n";
        }    //Change Here
        if (chkBxH4.isChecked()) {
            checkedToppingsName2 = checkedToppingsName2 + getString(R.string.mozzarella);
        }           //Change Here

        intent.putExtra(ToppingName2, checkedToppingsName2);

        startActivity(intent);

    }
}