package com.desarrollo.directormedico.DATOS;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MedicosBDHelper extends SQLiteOpenHelper {

    public static final int VERSION_BASE_DATOS = 1;
    public static final String BASE_DATOS = "Medicos.db";

    public MedicosBDHelper(Context context) {
        super(context, BASE_DATOS, null, VERSION_BASE_DATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String ConsultaCreacion = "CREATE TABLE "
                + MedicosContrato.MedicoIngreso.NOMBRE_TABLA
                + "("
                + MedicosContrato.MedicoIngreso.ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + MedicosContrato.MedicoIngreso.ID
                + " TEXT NOT NULL,"
                + MedicosContrato.MedicoIngreso.NOMBRE
                + " TEXT NOT NULL,"
                + MedicosContrato.MedicoIngreso.ESPECIALIDAD
                + " TEXT NOT NULL,"
                + MedicosContrato.MedicoIngreso.TELEFONO
                + " TEXT NOT NULL,"
                + MedicosContrato.MedicoIngreso.BIOGRAFIA
                + " TEXT NOT NULL,"
                + MedicosContrato.MedicoIngreso.AVATAR
                + " TEXT,"
                + "UNIQUE ("
                + MedicosContrato.MedicoIngreso.ID +"))";

        sqLiteDatabase.execSQL(ConsultaCreacion);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }

    public long InsertarMedico(SQLiteDatabase database, Medicos medico) {
        return database.insert(MedicosContrato.MedicoIngreso.NOMBRE
                ,null
                , medico.toContentValues());
    }

    public void IngresarDatos(SQLiteDatabase database) {
        InsertarMedico(database, new Medicos("Paolo Lizarraga"
                , "Pediatra"
                , "978625515"
                , "Excelente Médico general con 5 años de experiencia"
                , "PaoloLM.jpg"));

        InsertarMedico(database, new Medicos("Daniel Loja"
                , "Cirugia"
                , "952853779"
                , "Excelente Médico general con 5 años de experiencia"
                , "Daniel.jpg"));

        InsertarMedico(database, new Medicos("Anthony Belizario"
                , "Diagnóstata"
                , "983665303"
                , "Excelente Médico general con 5 años de experiencia"
                , "Belizario.jpg"));

        InsertarMedico(database, new Medicos("Miguel Llanque"
                , "Emergenciólogo"
                , "952626737"
                , "Excelente Médico general con 5 años de experiencia"
                , "Miguel.jpg"));
    }
}
