package com.example.amp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText width_input;
    EditText length_input;
    EditText weight_input;
    Spinner destination_spinner;
    Spinner item_spinner;
    Button calculation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        width_input = (EditText)findViewById(R.id.width_input);
        length_input = (EditText)findViewById(R.id.length_input);
        weight_input= (EditText)findViewById(R.id.width_input);
        calculation = (Button)findViewById(R.id.calculation);
        destination_spinner = (Spinner)findViewById(R.id.destination_spinner);
        String[] destinations = new String[]{"Canada", "United States", "International"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, destinations);
        destination_spinner.setAdapter(adapter);
        item_spinner = (Spinner)findViewById(R.id.item_spinner);
        String[] items = new String[]{"Stamp", "Meter", "Postal Indicia"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        item_spinner.setAdapter(adapter2);

        width_input.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

            }
        });

        length_input.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

            }
        });

        weight_input.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

            }
        });

        calculation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}