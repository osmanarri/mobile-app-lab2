package com.example.osmantahir_comp304sec004_lab2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class CanadianPizzaToppings extends AppCompatActivity {

    Prices price;
    TextView total;
    double total_price;
    Button btSave;
//    EditText editText;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canadian_pizza_toppings);

        // Action bar
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Canadian Pizza Toppings");

        // an object of Prices class
        price = new Prices();
        total = findViewById(R.id.total1);
        btSave = (Button) findViewById(R.id.btnSave);
//        editText =(EditText)findViewById(R.id.etText);

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sharedPreferences = getSharedPreferences("Save Data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Value", total.getText().toString());
                editor.apply();

                Toast.makeText(CanadianPizzaToppings.this, "Saved", Toast.LENGTH_SHORT).show();

            }
        });





    }

    public static final String ToppingName = "osmantahir_com304sec004_lab2.MESSAGE";

    /** Called when the user taps the "Next" button */
    public void goToDisplayChoiceA(View view) {
        Intent intent = new Intent(this, DisplayCanadianPizza.class);  //Change Here
//        Intent intent1 = new Intent(this, CheckoutPage.class);


        String checkedToppingsName="";

        CheckBox chkBxH1= (CheckBox) findViewById(R.id.checkPepperoni);    //Change Here
        CheckBox chkBxH2= (CheckBox) findViewById(R.id.checkBaconCrumble);    //Change Here
        CheckBox chkBxH3= (CheckBox) findViewById(R.id.checkSlicedMushrooms);    //Change Here
        CheckBox chkBxH4= (CheckBox) findViewById(R.id.checkMozzarella);    //Change Here

        if(chkBxH1.isChecked()){checkedToppingsName=checkedToppingsName + getString(R.string.pepperoni)+"\n\n";}    //Change Here
        if(chkBxH2.isChecked()){checkedToppingsName=checkedToppingsName + getString(R.string.bacon)+"\n\n";}    //Change Here
        if(chkBxH3.isChecked()){checkedToppingsName=checkedToppingsName + getString(R.string.mushrooms)+"\n\n";}    //Change Here
        if(chkBxH4.isChecked()){checkedToppingsName=checkedToppingsName + getString(R.string.mozzarella);}           //Change Here

//        intent1.putExtra("keyword2", String.valueOf(total_price));

        intent.putExtra(ToppingName, checkedToppingsName);

        intent.putExtra("keyword", String.valueOf(total_price));

        startActivity(intent);
//        startActivity(intent1);

    }


    public void onCheckboxCliced(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()){

            case R.id.checkPepperoni:

                if(checked)
                     price.setPepperoni(1.50);
                else
                     price.setPepperoni(0);
                break;

            case R.id.checkBaconCrumble:

                if(checked)
                    price.setBaconCrumble(1.25);

                else
                    price.setBaconCrumble(0);
                break;

            case R.id.checkSlicedMushrooms:

                if(checked)
                    price.setMushrooms(1.15);

                else
                    price.setMushrooms(0);
                break;

            case R.id.checkMozzarella:

                if(checked)
                    price.setMozzerella(0.99);
                else
                    price.setMozzerella(0);
                break;
        }

        total.setText("Toppins Price: " + calculate_total());
    }

    private double calculate_total(){

        return total_price = price.getPepperoni() + price.getBaconCrumble() + price.getMushrooms() + price.getMozzerella();
    }


}