package com.example.activity_11_no_evidence.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.activity_11_no_evidence.entidades.Actividades;

import java.util.ArrayList;

public class DbPomo extends DbHelper {

    Context context;

    public DbPomo(@Nullable Context context) {
        super(context);
        this.context = context;

    }

    public long insertarActividades(String act, String wtime, String rtime, String lrtime){

        long id = 0;
        try {


        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("act", act);
        values.put("wtime",wtime);
        values.put("rtime", rtime);
        values.put("lrtime", lrtime);

        id = db.insert(TABLE_ACTIVIDAD, null, values);
        } catch (Exception ex){
            ex.toString();
        }
       return id;
    }
    public ArrayList<Actividades> mostrarActividades(){
        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ArrayList<Actividades> listaActividades = new ArrayList<>();
        Actividades actividades = null;
        Cursor cursorActividades = null;

        cursorActividades = db.rawQuery("SELECT * FROM " + TABLE_ACTIVIDAD, null);

        if(cursorActividades.moveToFirst()) {
            do {
                actividades = new Actividades();
                actividades.setId(cursorActividades.getInt(0));
                actividades.setAct(cursorActividades.getString(1));
                actividades.setWtime(cursorActividades.getString(2));
                actividades.setRtime(cursorActividades.getString(3));
                actividades.setLrtime(cursorActividades.getString(4));
                listaActividades.add(actividades);
            } while (cursorActividades.moveToNext());
        }
            cursorActividades.close();

            return listaActividades;
        }

    }

