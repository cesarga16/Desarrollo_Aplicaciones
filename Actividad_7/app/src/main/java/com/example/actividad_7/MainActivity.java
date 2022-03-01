package com.example.actividad_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button sorpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sorpresa(View v){
        //Intent i = new Intent(getApplicationContext(),sorpresa.class);
        startActivity(new Intent(getApplicationContext(),sorpresa.class));
        overridePendingTransition(R.anim.slide_to_left, R.anim.fade);

    }

}