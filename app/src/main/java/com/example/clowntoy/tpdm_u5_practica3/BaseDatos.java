package com.example.clowntoy.tpdm_u5_practica3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {
    public BaseDatos(Context context,String name,SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Edificio(ID INTEGER PRIMARY KEY,NOMBRE VARCHAR(20),DESCRIPCION VARCHAR(300),CODIGOIMG VARCHAR(10))");
        db.execSQL("INSERT INTO Edificio VALUES(1,'Edificio UD','Edificio con aulas encargado de los departamentos de sistemas computacionales,\ndepartamento de electrica, así como desarrollo escolar.','ud')");
        db.execSQL("INSERT INTO Edificio VALUES(2,'Edificio Administratico','Edificio encargado de los departamentos de recursos fiancieros, encargados de carreras,\ncentro de computo y demas.','admi')");
        db.execSQL("INSERT INTO Edificio VALUES(3,'Edificio BC','Edificio con aulas utilizado para clases y para\nel departamento de ciencias básicas.','bast')");
        db.execSQL("INSERT INTO Edificio VALUES(4,'Laboratorio de computo','Edificio con con el propositod de brindar aulas con sistemas computacionales\nasi como materiales para practicas con redes.','labc')");
        db.execSQL("INSERT INTO Edificio VALUES(5,'Centro de información','Edificio encargado de la biblioteca escolar, así como otros recursos de información\npara los estudiantes.','inf')");
        db.execSQL("INSERT INTO Edificio VALUES(6,'Edificio UVP','Edificio con aulas cede del centro de idiomas, departamento de servicio\nsocial entre otros.','uvp')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
