package com.example.activity_11_no_evidence;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.activity_11_no_evidence.adaptadores.ListaActividadesAdapter;
import com.example.activity_11_no_evidence.db.DbHelper;
import com.example.activity_11_no_evidence.db.DbPomo;
import com.example.activity_11_no_evidence.entidades.Actividades;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView listActividades;
ArrayList<Actividades> listaArrayActividades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listActividades = findViewById(R.id.listaActividades);
        listActividades.setLayoutManager(new LinearLayoutManager(this));

        DbPomo dbPomo = new DbPomo(MainActivity.this);

        listaArrayActividades = new ArrayList<>();
        ListaActividadesAdapter adapter = new ListaActividadesAdapter(dbPomo.mostrarActividades());
        listActividades.setAdapter(adapter);


    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_principal,menu);
    return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menuNuevo:
                nuevoRegitstro();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
    private void nuevoRegitstro(){
        Intent intent = new Intent(this,NuevoActivity.class);
        startActivity(intent);
    }

}