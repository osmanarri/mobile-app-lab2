package com.example.osmantahir_comp304sec004_lab2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class PaymentOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_option);

        // Action bar
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Payment Options And Delivery Address");

    }

    public static final String RegistrationData = "osmantahir_comp304sec004_lab02.MESSAGE";

    /** Called when the user taps the "Next" button */
    public void customerInfo(View view) {

        Intent intent = new Intent(this, CustomerInfor.class);


        String regData="";

        EditText name = findViewById(R.id.name);
        EditText address=findViewById(R.id.address);
        EditText postCode=findViewById(R.id.postal);
        EditText telephone=findViewById(R.id.telephone);
        EditText cardNumber=findViewById(R.id.cardnumber);

        RadioButton dbt=findViewById(R.id.debit);
        RadioButton vsa=findViewById(R.id.visa);
        RadioButton mst=findViewById(R.id.mastercard);

        String cardType="";
        if(dbt.isChecked()){cardType="Debit Card";}
        else if(vsa.isChecked()){cardType="Visa Card";}
        else {cardType="Master Card";}

        EditText expDate=findViewById(R.id.expiry);
        EditText cvv=findViewById(R.id.cvv);
        EditText favSport=findViewById(R.id.favsport);
        EditText favFood=findViewById(R.id.favfood);

        regData="Name: "+name.getText()+"\n"+"Address: "+address.getText()+"\n"+"Post Code: "+postCode.getText()+"\n"+
                "Telephone: "+telephone.getText()+"\n"+"Card Number: "+cardNumber.getText()+"\n"+"Card Type: "+cardType+"\n"+
                "Expiry Date: "+expDate.getText()+"\n"+"CVV: "+cvv.getText()+"\n"+"Favourite Sport: "+favSport.getText()+"\n"+
                "Favourite Food: "+favFood.getText()+"\n";

        intent.putExtra(RegistrationData, regData);

        startActivity(intent);




    }


}