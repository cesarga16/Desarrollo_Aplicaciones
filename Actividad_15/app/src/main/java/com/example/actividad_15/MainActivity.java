package com.example.actividad_15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText input;
    public TextView pulg, yard, cm;
    public Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.valueInput);
        pulg = findViewById(R.id.pulgadas);
        yard = findViewById(R.id.yardas);
        cm = findViewById(R.id.centimetros);
        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float value;
                float MtC, MtY, Mtp= 0;
//centimetros
                MtC = Float.valueOf(input.getText().toString());

                MtC = MtC*100;
                cm.setText("centimetros: " + MtC);
//pulgadas
                Mtp = Float.valueOf(input.getText().toString());

                Mtp = (float) (39.37)*Mtp;
                pulg.setText("pulgadas: " + Mtp);
//yardas
                MtY = Float.valueOf(input.getText().toString());

                MtY = (float) (1.094*MtY);
                yard.setText("yardas: " + MtY);
            }
        });
    }
}