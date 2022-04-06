package com.example.actividad_11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    public TextView Timer;
    public TextView timeWork, timeRest, timeLongRest;
    public Button startTimer;
    public EditText activityName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext(), Settings.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext(), activity_statistics.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
        //Timer records
        TextView timeWork = (TextView)findViewById(R.id.timeWork);
        TextView timeRest = (TextView)findViewById(R.id.timeRest);
        TextView timeLongRest = (TextView)findViewById(R.id.timeLongRest);
        //Timer Records

        //Activity name
        EditText activityName = (EditText)findViewById(R.id.activityName);
        //Activity name

        //ui
        TextView Timer = (TextView)findViewById(R.id.Timer);
        Button startTimer = (Button)findViewById(R.id.startTimer);
        //ui
        startTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CountDownTimer(30000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        Timer.setText(""+millisUntilFinished / 1000);
                    }

                    public void onFinish() {
                        Timer.setText("done!");
                    }
                }.start();

            }
        }

        );
    }




}