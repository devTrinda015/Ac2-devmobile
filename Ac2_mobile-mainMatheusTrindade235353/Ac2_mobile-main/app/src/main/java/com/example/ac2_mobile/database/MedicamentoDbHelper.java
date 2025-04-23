package com.example.ac2_mobile.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MedicamentoDbHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "medicamentos.db";
    private static final int DB_VERSION = 1;

    public MedicamentoDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE medicamentos (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "nome TEXT, " +
                        "descricao TEXT, " +
                        "horario TEXT, " +
                        "consumido INTEGER)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS medicamentos");
        onCreate(db);
    }
}
