package com.example.activity_11_no_evidence.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NOMBRE = "pomo.db";
    public static final String TABLE_ACTIVIDAD = "t_actividad";

    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_ACTIVIDAD + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "act TEXT NOT NULL," +
                "wtime TEXT NOT NULL," +
                "rtime TEXT NOT NULL," +
                "lrtime TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE " + TABLE_ACTIVIDAD);
        onCreate(sqLiteDatabase);

    }
}