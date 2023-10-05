package com.example.pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pantallas.ui.theme.MainActivity2;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private Spinner sp1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        et1 =(EditText) findViewById(R.id.factor1);
        et2 = (EditText) findViewById(R.id.factor2);
        tv1 = (TextView) findViewById(R.id.resultado);
        sp1 = (Spinner)findViewById(R.id.cositas);

        String [] opciones = {"sumar","restar","multiplicar","dividir"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);

        sp1.setAdapter(adapter);
    }

    public void Calcular(View view){

        String valor1_String = et1.getText().toString();

        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);

        int valor2_int = Integer.parseInt(valor2_String);

        String seleccion = sp1.getSelectedItem().toString();

        if(seleccion.equals("sumar")){

            int suma = valor1_int + valor2_int;

            String resultado = String.valueOf(suma);

            tv1.setText(resultado);

        } else if(seleccion.equals("restar")){

            int resta = valor1_int - valor2_int;

            String resultado = String.valueOf(resta);

            tv1.setText(resultado);

        } else if(seleccion.equals("multiplicar")) {

            int multi = valor1_int * valor2_int;

            String resultado = String.valueOf(multi);

            tv1.setText(resultado);

        } else if(seleccion.equals("dividir")){

            if(valor2_int != 0){

                int div = valor1_int / valor2_int;

                String resultado = String.valueOf(div);

                tv1.setText(resultado);

            } else {

                Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG).show();

            }

        }

    }

    public void siguiente(View view){

        Intent siguiente = new Intent(this, MainActivity2.class);

        startActivity(siguiente);

    }

}