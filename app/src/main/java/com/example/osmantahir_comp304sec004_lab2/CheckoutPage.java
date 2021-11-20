package com.example.osmantahir_comp304sec004_lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class CheckoutPage extends AppCompatActivity  {

    TextView pizzaPrice1;
    TextView toppingPrice1;

    TextView totalPrice1;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_page);

        // Action bar
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Checkout Page");

        //get the text value
        pizzaPrice1 = (TextView) findViewById(R.id.pizzaPrice);
        toppingPrice1 = (TextView) findViewById(R.id.toppingsPrice);
        totalPrice1 = (TextView) findViewById(R.id.totalPrice);

        Intent intent = getIntent();//done

        String name = intent.getStringExtra("keyword");//done


        pizzaPrice1.setText("Pizza price: "+ name);//done

        //-----------------shared Preference---------------------------------------
        SharedPreferences result = getSharedPreferences("Save Data", Context.MODE_PRIVATE);
//        SharedPreferences result2 = getSharedPreferences("Save Data2", Context.MODE_PRIVATE);

        String value1 = result.getString("Value", "Data not found");
//        String value2 = result.getString("Value", "Data not found");
        toppingPrice1.setText(value1);
//        doughSize.setText(value2);

        //-----------------shared Preference---------------------------------------
//        String s1, s2;
//        s1 = pizzaPrice1.getText().toString();
//        s2 = toppingPrice1.getText().toString();
//
//        double n1, n2, n3;
//
//                n1 = Double.parseDouble(s1);
//                n2 = Double.parseDouble(s2);
//
//                n3 = n1 + n2;
//
//                TextView result2 = (TextView)findViewById(R.id.totalPrice);
//
//                result2.setText("the total is" + n3);
//
//                Toast.makeText(CheckoutPage.this, "Sum of The Pizza" + n3, Toast.LENGTH_LONG).show();


//        btn = (Button) findViewById(R.id.btnTotal);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                TextView et1 = (TextView) findViewById(R.id.pizzaPrice);
//                TextView et2 = (TextView) findViewById(R.id.toppingsPrice);
//
//                String s1, s2;
//
//                s1 = et1.getText().toString();
//                s2 = et2.getText().toString();
//
//                double n1, n2, n3;
//
//                n1 = Double.parseDouble(s1);
//                n2 = Double.parseDouble(s2);
//
//                n3 = n1 + n2;
//
//                TextView result = (TextView)findViewById(R.id.totalPrice);
//
//                result.setText("the total is" + n3);
//
//                Toast.makeText(CheckoutPage.this, "Sum of The Pizza" + n3, Toast.LENGTH_LONG).show();
//
//            }
//        });




        Button button = (Button)findViewById(R.id.goToPaymentOption);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openPaymentOption();
            }
        });

    }
    public void openPaymentOption(){

        Intent intent = new Intent(this, PaymentOption.class);
        startActivity(intent);
    }



}