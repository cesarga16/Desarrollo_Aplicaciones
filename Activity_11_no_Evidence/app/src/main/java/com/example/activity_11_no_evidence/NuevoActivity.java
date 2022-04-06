package com.example.activity_11_no_evidence;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.activity_11_no_evidence.db.DbPomo;

public class NuevoActivity extends AppCompatActivity {

    EditText txtact, txtwork, txtrest, txtlongrest;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);

        txtact = findViewById(R.id.txtact);
        txtwork = findViewById(R.id.txtwork);
        txtrest = findViewById(R.id.txtrest);
        txtlongrest = findViewById(R.id.txtlongrest);

        btnsave = findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbPomo dbPomo = new DbPomo(NuevoActivity.this);
                long id = dbPomo.insertarActividades(txtact.getText().toString(),txtwork.getText().toString(),txtrest.getText().toString(),txtlongrest.getText().toString());

                if(id > 0){
                    Toast.makeText(NuevoActivity.this, "Registro Guardado", Toast.LENGTH_LONG).show();
                    limpiar();
                } else {
                    Toast.makeText(NuevoActivity.this, "Error al guardar registro", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    private void limpiar(){
        txtact.setText("");
        txtwork.setText("");
        txtrest.setText("");
        txtlongrest.setText("");

    }
}