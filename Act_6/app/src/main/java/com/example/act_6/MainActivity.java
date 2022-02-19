package com.example.act_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private TextView fechaN, fechaA, edad;
    private EditText fechaInput;
    private String selectDate = "";
    private Calendar nacimientoDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        fechaA = (TextView)findViewById(R.id.fechaA);
        fechaN = (TextView)findViewById(R.id.fechaN);
        edad = (TextView)findViewById(R.id.edad);
        fechaInput = (EditText) findViewById(R.id.fechaInput);
        fechaInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePickerDialog = new TimePickerFragment();
                datePickerDialog.show(getSupportFragmentManager(), "date-picker");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar consultDate = Calendar.getInstance();
                fechaA.setText("Fecha actual: "+DateFormat.getDateInstance(DateFormat.FULL).format(consultDate.getTime()).toString());
                fechaN.setText("Fecha de nacimiento: "+selectDate);
                //Calculates the time passed
                Integer edadInt = consultDate.get(Calendar.YEAR) - nacimientoDate.get((Calendar.YEAR));
                Integer edadMonth = nacimientoDate.get((Calendar.MONTH)) - consultDate.get(Calendar.MONTH);
                //positive months
                edadMonth = edadMonth * -1;
                edad.setText("Tienes " + edadInt.toString() + " años, y " + edadMonth + " meses");
            }
        });

    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
    nacimientoDate = Calendar.getInstance();
    
    nacimientoDate.set(Calendar.YEAR,year);
    nacimientoDate.set(Calendar.MONTH,month);
    nacimientoDate.set(Calendar.DAY_OF_MONTH,dayOfMonth);

    selectDate = DateFormat.getDateInstance(DateFormat.FULL).format(nacimientoDate.getTime());

    fechaInput.setText(selectDate);

    }
}