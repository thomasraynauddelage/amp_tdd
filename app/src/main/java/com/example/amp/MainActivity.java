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
import android.widget.TextView;

import com.example.amp.service.CalculationService;

import java.io.PrintWriter;
import java.io.StringWriter;

public class MainActivity extends AppCompatActivity {

    EditText width_input;
    EditText length_input;
    EditText weight_input;
    Spinner destination_spinner;
    Spinner item_spinner;
    Button calculation;
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        width_input = (EditText)findViewById(R.id.width_input);
        length_input = (EditText)findViewById(R.id.length_input);
        weight_input= (EditText)findViewById(R.id.weight_input);
        calculation = (Button)findViewById(R.id.calculation);
        destination_spinner = (Spinner)findViewById(R.id.destination_spinner);
        String[] destinations = new String[]{"Canada", "United States", "International"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, destinations);
        destination_spinner.setAdapter(adapter);
        item_spinner = (Spinner)findViewById(R.id.item_spinner);
        String[] items = new String[]{"Stamp", "Meter", "Postal Indicia"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        item_spinner.setAdapter(adapter2);
        output = (TextView)findViewById(R.id.output);

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
                double width, length, weight, price;
                String destination, item;
                try {
                    width = Double.parseDouble(width_input.getText().toString());
                    try {
                        length = Double.parseDouble(length_input.getText().toString());
                        try {
                            weight = Double.parseDouble(weight_input.getText().toString());
                            destination = destination_spinner.getSelectedItem().toString();
                            item = item_spinner.getSelectedItem().toString();
                            try {
                                price = CalculationService.getPrice(width,length,weight,destination,item);
                                String formattedPrice = String.format("%.2f", price);
                                output.setText("$"+formattedPrice);
                            } catch (IllegalArgumentException e) {
                                output.setText(e.getMessage());
                            }
                        } catch (NumberFormatException e) {
                            output.setText("Weight should be a number!");
                        }
                    } catch (NumberFormatException e) {
                        output.setText("Length should be a number!");
                    }
                } catch (NumberFormatException e) {
                    output.setText("Width should be a number!");
                }
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