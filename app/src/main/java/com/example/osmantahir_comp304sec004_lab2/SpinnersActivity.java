package com.example.osmantahir_comp304sec004_lab2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnersActivity extends AppCompatActivity {


//    RadioGroup radioGroup;
//    RadioButton thin;
//    RadioButton thick;

    Spinner spinner ;
    TextView result;
    TextView showPizzaSizePrice;
//    Button btSave2;

    double pizza_price;
    Prices price;
    Button btnPizzaSize;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinners);

        // Action bar
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Pizza Size And Dough Type");
        // Action bar

//        radioGroup = findViewById(R.id.group);
//        thin = findViewById(R.id.radioBtnThin);
//        thick = findViewById(R.id.radioBtnThick);
//        btSave2 = (Button) findViewById(R.id.btnSave2);
        //-----------------------------------------------
         result = findViewById(R.id.textViewSize); // to the spinner

         spinner = findViewById(R.id.spinnerPizza);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.pizzaSize, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner.setAdapter(adapter);
        //---------------------------------------------
        // an object of Prices class
         price = new Prices();





        Button btnSpinner = (Button) findViewById(R.id.button4);

        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


              Intent intent = new Intent(getApplicationContext(), CheckoutPage.class);
               startActivity(intent);
                onSelectedSpinner();


            }
        });

    }



    public void onSelectedSpinner(){

        Intent intent = new Intent(SpinnersActivity.this, CheckoutPage.class);
        intent.putExtra("keyword", String.valueOf(pizza_price));
        startActivity(intent);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                if(spinner.getSelectedItem().toString().equals("Chose Pizza Size")){

                }
                if(spinner.getSelectedItem().toString().equals("Small")){

                    price.setSmall(5.99);
                }
                else if(spinner.getSelectedItem().toString().equals("Medium")){
                     price.setMedium(8.99);
                }
                else if(spinner.getSelectedItem().toString().equals("Large")){
                    price.setLarge(11.99);
                }
                else if(spinner.getSelectedItem().toString().equals("Extra Large")){
                    price.setxLarge(14.99);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        result.setText("This size costs : $" + calculate_total());

    }

    private double calculate_total() {

        if(spinner.getSelectedItem().toString().equals("Chose Pizza Size")){
            return 0;
        }
        if (spinner.getSelectedItem().toString().equals("Small")) {
            return pizza_price = price.getSmall();
        } else if (spinner.getSelectedItem().toString().equals("Medium")) {
            return pizza_price = price.getMedium();
        } else if (spinner.getSelectedItem().toString().equals("Large")) {
            return pizza_price = price.getLarge();
        } else if (spinner.getSelectedItem().toString().equals("Extra Large")) {
            return pizza_price = price.getxLarge();
        } else return 1.2;
    }


}