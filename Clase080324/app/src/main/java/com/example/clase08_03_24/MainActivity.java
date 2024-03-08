package com.example.clase08_03_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtVal1;
    EditText edtVal2;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtVal1 = findViewById(R.id.edtVal1);
        edtVal2 = findViewById(R.id.edtVal2);
        btnCalcular = findViewById(R.id.btnCalcular);
    }
}