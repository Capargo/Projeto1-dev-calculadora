package com.example.conversordolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edValorDolar, edQuanDolar;
    TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edValorDolar = findViewById(R.id.edValorDolar);
        edQuanDolar = findViewById(R.id.edQuanDolar);


        txtResultado = findViewById(R.id.txtResultado);


    }

    public void calcular(View view) {

        double quantDolar = Double.parseDouble(edQuanDolar.getText().toString());
        double valorDolar = Double.parseDouble(edValorDolar.getText().toString());
        double totalReais = valorDolar * quantDolar;

        txtResultado.setText("R$: " + totalReais);


    }


}