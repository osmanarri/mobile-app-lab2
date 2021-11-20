package com.example.osmantahir_comp304sec004_lab2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class HawaiianPizzaToppings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hawaiian_pizza_toppings);

        // Action bar
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Hawaiian Pizza Toppings");
    }

    public static final String ToppingName = "osmantahir_com304sec004_lab2.MESSAGE";

    /** Called when the user taps the "Next" button */
    public void goToDisplayChoiceA(View view) {    //Change Here
        Intent intent = new Intent(this, DisplayHawaiianPizza.class);  //Change Here

        String checkedToppingsName="";

        CheckBox chkBxH1= (CheckBox) findViewById(R.id.checkPineapple);    //Change Here
        CheckBox chkBxH2= (CheckBox) findViewById(R.id.checkSauce);    //Change Here
        CheckBox chkBxH3= (CheckBox) findViewById(R.id.checkOnion);    //Change Here
        CheckBox chkBxH4= (CheckBox) findViewById(R.id.checkMozzarella);    //Change Here

        if(chkBxH1.isChecked()){checkedToppingsName=checkedToppingsName + getString(R.string.pineapple)+"\n\n";}    //Change Here
        if(chkBxH2.isChecked()){checkedToppingsName=checkedToppingsName + getString(R.string.sauce)+"\n\n";}    //Change Here
        if(chkBxH3.isChecked()){checkedToppingsName=checkedToppingsName + getString(R.string.onion)+"\n\n";}    //Change Here
        if(chkBxH4.isChecked()){checkedToppingsName=checkedToppingsName + getString(R.string.mozzarella);}           //Change Here

        intent.putExtra(ToppingName, checkedToppingsName);

        startActivity(intent);
    }
}