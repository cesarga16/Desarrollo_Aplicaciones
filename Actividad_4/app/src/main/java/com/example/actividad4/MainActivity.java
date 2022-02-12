package com.example.actividad4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void validar(View view){

        //Declaracion de checkboxes, botones y arrays
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkBox5);

        TextView elementos = (TextView) findViewById(R.id.elementos);
        Button botonSend = (Button) findViewById(R.id.botonSend);

        ArrayList<String> carrito = new ArrayList<String>();

        //Borra el textview
        elementos.setText("");

        //carrito.clear(); //si el array imprime de mas

        //Revisa si los checkboxes estan activos y escribe dentro de la lista
        if(checkBox1.isChecked()){
            carrito.add((String) checkBox1.getText());
        }
        if(checkBox2.isChecked()){
            carrito.add((String) checkBox2.getText());
        }
        if(checkBox3.isChecked()){
            carrito.add((String) checkBox3.getText());
        }
        if(checkBox4.isChecked()){
            carrito.add((String) checkBox4.getText());
        }
        if(checkBox5.isChecked()){
            carrito.add((String) checkBox5.getText());
        }

        //imprime los valores dentro del textview
        for(int i = 0; i < carrito.size(); i++){
            elementos.append(carrito.get(i));
            elementos.append("\n");
        }
    }
}