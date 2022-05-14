package com.example.evidencia_3;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.evidencia_3.databinding.ActivityMainBinding;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    public int workTime;
    public int restTime;
    public int longRestTime;
    public Button button1;
    public Button next;
    public TextView text_home;
    public boolean onOff;
    public int[] pomoTimer;
    public CountDownTimer actualTimer;
    public int pauseTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        button1 = findViewById(R.id.button1);
        text_home = (TextView) findViewById(R.id.text_home);

        //default values of timer
        workTime = 25000;
        restTime = 5000;
        longRestTime = 30000;
        pauseTime = 25000;


        int[] pomoTimer = {workTime,restTime,workTime,restTime,workTime,restTime,workTime,restTime,longRestTime};
    }
    public void iniciaTimer(View view)
    {
        //changes values on click
        onOff = !onOff;
        if(onOff) {
                startTimer();
                button1.setText("Empezado");
        }else
                 {
                     button1.setText("Cancelado");
                     cancelTimer();
                 }
        //debugger for boolean
        /*if(onOff){
            text_home.setText("true");
        }else{text_home.setText("false");}*/
        //debugger for boolean

    }
    public void startTimer()
    {

        actualTimer = new CountDownTimer(workTime, 1000) {
            public void onTick(long millisUntilFinished) {
                // Used for formatting digit to be in 2 digits only
                NumberFormat f = new DecimalFormat("00");
                long min = (millisUntilFinished / 60000) % 60;
                long sec = (millisUntilFinished / 1000) % 60;
                text_home.setText(f.format(min) + ":" + f.format(sec));

            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                text_home.setText("finished");
            }

        }.start();







        //text_home.setText("what");

    }

    public void cancelTimer()
    {
        actualTimer.cancel();
        text_home.setText("cancelled");
    }
    public void pauseTimer()
    {
        actualTimer.cancel();
        text_home.setText("paused");
        pauseTime = pauseTime + 1000;
    }
    private void timer()
    {
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if(pauseTime>0)
                {
                    pauseTime--;
                    text_home.setText(""+pauseTime);
                    handler.postDelayed(this,1000);
                }
                else
                {
                    text_home.setText("finished");  //timer complete
                }
            }
        });
    }
}