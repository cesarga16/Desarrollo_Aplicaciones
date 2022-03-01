package com.example.actividad_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sorpresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorpresa);
    }

    public void regresar(View v){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.toleftslide, R.anim.leftslide);

    }
}