package com.example.osmantahir_comp304sec004_lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button btnSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Action bar
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Please Check Our Menu Here ----->");

        btnSecond = (Button) findViewById(R.id.button2);

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openMainActivity();
            }
        });
    }
    public void openMainActivity(){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.pizza_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.canadianPizza:
                Toast.makeText(this, "Canadian Pizza Selected", Toast.LENGTH_SHORT).show();

                Intent canadianPizzaIntent = new Intent(this, CanadianPizzaToppings.class);
                startActivity(canadianPizzaIntent);

                break;

            case R.id.chickenCaesar:
                Toast.makeText(this, "Chicken Caesar Selected", Toast.LENGTH_SHORT).show();

                Intent chickenCaesarIntent = new Intent(this, ChickenCaesarToppings.class);
                startActivity(chickenCaesarIntent);

                break;

            case R.id.hawaiianPizza:
                Toast.makeText(this, "Hawaiian Pizza Selected", Toast.LENGTH_SHORT).show();

                Intent hawaiianPizzaIntent = new Intent(this, HawaiianPizzaToppings.class);
                startActivity(hawaiianPizzaIntent);

                break;

            case R.id.smokeyMapleBacon:
                Toast.makeText(this, "Smokey Maple Bacon Pizza Selected", Toast.LENGTH_SHORT).show();

                Intent smokeyMapleBaconIntent = new Intent(this, SmokeyBaconToppings.class);
                startActivity(smokeyMapleBaconIntent);

                break;

            case R.id.veggieLover:
                Toast.makeText(this, "Veggie Lover's Pizza Selected", Toast.LENGTH_SHORT).show();

                Intent veggieLoverIntent = new Intent(this, VeggieLoverToppings.class);
                startActivity(veggieLoverIntent);

                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}