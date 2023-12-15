package com.pavan.netclan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;

public class refineactivity extends AppCompatActivity {


    ArrayAdapter<CharSequence> adapteritems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refineactivity);


        Spinner dropdownSpinner = findViewById(R.id.dropdownSpinner);

        adapteritems = ArrayAdapter.createFromResource(this,R.array.options,android.R.layout.simple_spinner_item);
        adapteritems.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdownSpinner.setAdapter(adapteritems);


    }
}