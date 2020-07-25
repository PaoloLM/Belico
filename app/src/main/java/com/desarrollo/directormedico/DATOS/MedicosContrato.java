package com.desarrollo.directormedico.DATOS;

import android.provider.BaseColumns;

public class MedicosContrato {

    public static abstract class MedicoIngreso implements BaseColumns {
        public static  final String NOMBRE_TABLA = "medicos";
        public static  final String ID = "id";
        public static  final String NOMBRE = "nombre";
        public static  final String ESPECIALIDAD = "especialidad";
        public static  final String TELEFONO = "telefono";
        public static  final String BIOGRAFIA = "biografia";
        public static  final String AVATAR = "avatar";
    }
}
