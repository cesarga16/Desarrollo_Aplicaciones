package com.example.act_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        TextView textview = (TextView)findViewById(R.id.texview);
        EditText input = (EditText) findViewById(R.id.input);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textview.setText(input.getText());
                input.setText(" ");
            };
        });
    }

}