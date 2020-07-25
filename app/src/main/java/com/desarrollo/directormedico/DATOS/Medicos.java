package com.desarrollo.directormedico.DATOS;

import android.content.ContentValues;

import java.util.UUID;

public class Medicos {
    private String id;
    private String nombre;
    private String especialidad;
    private String telefono;
    private String biografia;
    private String avatar;

    public Medicos(String nombre, String especialidad, String telefono, String biografia, String avatar) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.biografia = biografia;
        this.avatar = avatar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MedicosContrato.MedicoIngreso.ID, id);
        contentValues.put(MedicosContrato.MedicoIngreso.NOMBRE, nombre);
        contentValues.put(MedicosContrato.MedicoIngreso.ESPECIALIDAD, especialidad);
        contentValues.put(MedicosContrato.MedicoIngreso.TELEFONO, telefono);
        contentValues.put(MedicosContrato.MedicoIngreso.BIOGRAFIA, biografia);
        contentValues.put(MedicosContrato.MedicoIngreso.AVATAR, avatar);
        return  contentValues;
    }
}
