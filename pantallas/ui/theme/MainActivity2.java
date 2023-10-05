package com.example.pantallas.ui.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pantallas.MainActivity;
import com.example.pantallas.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void siguiente(View view){

        Intent siguiente = new Intent(this, MainActivity.class);

        startActivity(siguiente);

    }

}