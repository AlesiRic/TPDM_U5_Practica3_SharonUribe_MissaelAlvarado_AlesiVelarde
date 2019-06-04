package com.example.clowntoy.tpdm_u5_practica3;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    BaseDatos base;
    TextView titu,desc;
    ImageView im;
    ImageView[] imagenes;
    LinearLayout line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titu=findViewById(R.id.titulo);
        desc=findViewById(R.id.descripcion);
        im=findViewById(R.id.imagen);
        line=findViewById(R.id.imagenViewer);


        base=new BaseDatos(this,"Desc",null,1);
        int valor=getIntent().getExtras().getInt("numero");

        Cursor c=base.getReadableDatabase().rawQuery("SELECT * FROM Edificio WHERE ID="+valor,null);
        c.moveToFirst();
        titu.setText(c.getString(1));
        desc.setText(c.getString(2));
        imagenes=new ImageView[4];
        for(int i=0;i<4;i++){
            imagenes[i]=new ImageView(MainActivity.this);
        }
        switch(c.getString(3)){
            case "ud":
                im.setImageResource(R.drawable.ud1);
                imagenes[0].setImageResource(R.drawable.ud2);
                imagenes[1].setImageResource(R.drawable.ud3);
                imagenes[2].setImageResource(R.drawable.ud4);
                imagenes[3].setImageResource(R.drawable.ud5);
                for(int i=0;i<4;i++){
                    line.addView(imagenes[i]);
                }
                break;
            case "admi":
                im.setImageResource(R.drawable.admi1);
                imagenes[0].setImageResource(R.drawable.admi2);
                imagenes[1].setImageResource(R.drawable.admi3);
                imagenes[2].setImageResource(R.drawable.admi4);
                imagenes[3].setImageResource(R.drawable.admi5);
                for(int i=0;i<4;i++){
                    line.addView(imagenes[i]);
                }
                break;
            case "bast":
                im.setImageResource(R.drawable.bast1);
                imagenes[0].setImageResource(R.drawable.bast2);
                imagenes[1].setImageResource(R.drawable.bast3);
                imagenes[2].setImageResource(R.drawable.bast4);
                imagenes[3].setImageResource(R.drawable.bast5);
                for(int i=0;i<4;i++){
                    line.addView(imagenes[i]);
                }
                break;
            case "labc":
                im.setImageResource(R.drawable.labc1);
                imagenes[0].setImageResource(R.drawable.labc2);
                imagenes[1].setImageResource(R.drawable.labc3);
                imagenes[2].setImageResource(R.drawable.labc4);
                imagenes[3].setImageResource(R.drawable.labc5);
                for(int i=0;i<4;i++){
                    line.addView(imagenes[i]);
                }
                break;
            case "inf":
                im.setImageResource(R.drawable.inf1);
                imagenes[0].setImageResource(R.drawable.inf2);
                imagenes[1].setImageResource(R.drawable.inf3);
                imagenes[2].setImageResource(R.drawable.inf4);
                imagenes[3].setImageResource(R.drawable.inf5);
                for(int i=0;i<4;i++){
                    line.addView(imagenes[i]);
                }
                break;
            case "uvp":
                im.setImageResource(R.drawable.uvp1);
                imagenes[0].setImageResource(R.drawable.uvp2);
                imagenes[1].setImageResource(R.drawable.uvp3);
                imagenes[2].setImageResource(R.drawable.uvp4);
                imagenes[3].setImageResource(R.drawable.uvp5);
                for(int i=0;i<4;i++){
                    line.addView(imagenes[i]);
                }
                break;
            default:break;
        }


    }
}
