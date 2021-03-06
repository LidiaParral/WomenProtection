package com.dam.womenprotection.BottomNav;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dam.womenprotection.Adapter.CHelperClass;
import com.dam.womenprotection.Adapter.Categoriesdapter;
import com.dam.womenprotection.Adapter.FHelperClass;
import com.dam.womenprotection.Adapter.FeaturedAdapter;
import com.dam.womenprotection.Adapter.MVHelperClass;
import com.dam.womenprotection.Adapter.MostViewAdapter;
import com.dam.womenprotection.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView rvFeatured;
    RecyclerView rvMostView;
    RecyclerView rvCateg;
    RecyclerView.Adapter adapter;
    Button btnAlert;

    RelativeLayout rl;
    ImageButton btnArrow;
    CardView cardView;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFeatured = findViewById(R.id.featured_rv);
        rvMostView = findViewById(R.id.rvMostView);
        rvCateg = findViewById(R.id.rvCategories);



        rvFeatured();
        rvMostView();
        rvCateg();

        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);

        navigationView.setSelectedItemId(R.id.Home);

        navigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.Advert:
                    startActivity(new Intent(getApplicationContext(), BlogActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.Maps:
                    startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.Help:
                    startActivity(new Intent(getApplicationContext(), HelpActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.Profile:
                    startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                    overridePendingTransition(0, 0);
                    return true;

            }
            return false;
        });

    }

    private void rvCateg() {
        rvCateg.setHasFixedSize(true);
        rvCateg.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


        ArrayList<CHelperClass> fHelperClasses1 = new ArrayList<>();
        //A??adir todos los post aqu??: imagen + title + description
        fHelperClasses1.add(new CHelperClass("??Qu?? es libres?",R.drawable.mujereslibres));
        fHelperClasses1.add(new CHelperClass("Estamos contigo",R.drawable.estamoscontigo));
        fHelperClasses1.add(new CHelperClass("??Qu?? hacer? " + "\n"+
                "#Se??alDeSocorro'",R.drawable.sos));
        fHelperClasses1.add(new CHelperClass("Herramientas de" + "\n" +
                " auto-protecci??n",R.drawable.autoproteccion));
        fHelperClasses1.add(new CHelperClass("Testimonios",R.drawable.testimonios));
        fHelperClasses1.add(new CHelperClass("Tipos de " + "\n" +
                "violencia",R.drawable.tipoviolencia));
        adapter = new Categoriesdapter(fHelperClasses1);
        rvCateg.setAdapter(adapter);


    }

    private void rvMostView() {

        rvMostView.setHasFixedSize(true);
        rvMostView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        //https://malostratos.org/eventos-para-victimas-de-violencia/

        ArrayList<MVHelperClass> fHelperClasses1 = new ArrayList<>();
        //A??adir todos los post aqu??: imagen + title + description
        fHelperClasses1.add(new MVHelperClass(R.drawable.noviembre25, "XXVI Jornadas T??cnicas contra la Violencia de G??nero:","El 27 de noviembre, la Comisi??n para la Investigaci??n de Malos Tratos a Mujeres participa en las XXVI Jornadas T??cnicas contra la Violencia de G??nero: Mujeres j??venes ante la Violencia de G??nero, organizadas por el Ayuntamiento de Fuenlabrada."));
        fHelperClasses1.add(new MVHelperClass(R.drawable.abolicion, "Presentaci??n de la Ley Org??nica Abolicionista del Sistema Prostitucional","Presentaci??n, el 18 de Noviembre de 18:00 - 20:00, de la Ley Org??nica Abolicionista Del Sistema Prostitucional, una iniciativa del movimiento feminista, en la que m??s de 100 mujeres y organizaciones hemos trabajado para que este proyecto sea una realidad que pueda cambiar la vida de las mujeres.'https://malostratos.org/event/presentacion-de-la-ley-organica-abolicionista-del-sistema-prostitucional/' "));
        fHelperClasses1.add(new MVHelperClass(R.drawable.marzo8, "Encuentro Abolicionista: juntas al #8M","Las abolicionistas vamos juntas al 8M porque: la prostituci??n reafirma y perpet??a la desigualdad entre los sexos. La industria sexual es hoy una multinacional m??s del crimen y la explotaci??n de ni??as y mujeres.Nos reuniremos a las 16:00 en la Plaza de Callao."));
        fHelperClasses1.add(new MVHelperClass(R.drawable.mujeresmigrantes, "Mujeres migrantes","Sara Vicente, coordinadora de nuestro equipo en Navarra, impartir?? una formaci??n, a partir de las 10:30, sobre ???Respuestas legales frente a las violencias machistas."));
        fHelperClasses1.add(new MVHelperClass(R.drawable.paloenpalo, "De palo en palo","Visionado del cortometraje 'De Palo en Palo', realizado por la Comisi??n para la Invetsigaci??n de Malos Tratos a Mujeres, el 28 de Noviembre a las 19:00, Sede de la Asociaci??n MLCD de Camas"));
        fHelperClasses1.add(new MVHelperClass(R.drawable.feminismo, "Presentaci??n del libro ???Feminismos???","El martes 26 de febrero, la soci??loga Beatriz Ranea estar?? en Casa del Libro de Gran V??a de Madrid presentando su primer libro, acompa??ada por las profesoras Rosa Cobo y Luisa Posada Kubissa.Ac??rcate a conocer ???Feminismos: Antolog??a de textos feministas para uso de las generaciones m??s j??venes y de las que no lo son tanto???."));
        adapter = new MostViewAdapter(fHelperClasses1);
        rvMostView.setAdapter(adapter);

    }

    private void rvFeatured() {

        rvFeatured.setHasFixedSize(true);
        rvFeatured.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        //https://smoda.elpais.com/moda/actualidad/dia-violencia-genero-2016-campanas-reflexionar/

        ArrayList<FHelperClass> fHelperClasses = new ArrayList<>();
        //A??adir todos los post aqu??: imagen + title + description
        fHelperClasses.add(new FHelperClass(R.drawable.pakistan, "'Beat me'","Hace unos d??as, la ONU Mujeres Pakist??n lanzaba una potente campa??a,env??an un potente mensaje contra la violencia machista. ??Parad??jicamente, la campa??a presenta a mujeres que piden a los hombres que las golpeen o las venzan (beat me puede tener ambos significados en ingl??s) pero en aquello en lo que son buenas. Tiene como objetivo inspirar a las mujeres a reafirmar que son m??s fuertes de lo que se les hace creer y romper la percepci??n de que una mujer es d??bil. "));
        fHelperClasses.add(new FHelperClass(R.drawable.diaviolencia, "??D??a de t??a buena maciza??","??Eliminar la violencia machista es una lucha de todos los d??as?? es el mensaje de la campa??a del Ayuntamiento de Madrid para este 25 de noviembre. La Direcci??n General de Igualdad y de Medios y la agencia de publicidad Kitchen han ideado una serie de carteles, pulseras, pegatinas y chapas con frases que denuncian la violencia sexual que sufren las mujeres."));
        fHelperClasses.add(new FHelperClass(R.drawable.thedress, "#TheDress","El vestido m??s viral de 2015 (y probablemente de todos los tiempos) sirvi?? de percha para esta campa??a de la rama de Sud??frica del Ej??rcito de Salvaci??n (confesi??n evangelista mucho m??s conocida por su labor de beneficencia). Bajo el lema #StopAbuseAgainstWomen (??parar el abuso contra las mujeres??), La campa??a fue muy aplaudida en las redes sociales por su creatividad. Teniendo en cuenta que en Sud??frica cada seis horas muere una mujer a manos de su pareja (seg??n datos de la ONU), este es el verdadero #thedress que deber??a hacerse viral."));
        fHelperClasses.add(new FHelperClass(R.drawable.poster, "El p??ster que muestra la realidad","La organizaci??n instal?? en Hamburgo (Alemania) el primer p??ster que responde ante las miradas. Cuando nadie le presta atenci??n, la imagen instalada en marquesinas de la ciudad muestra a un hombre pegando a una mujer. Sin embarg, cuando detecta cualquier mirada, la misma pareja aparece sonriendo. Una idea brillante para recordarnos que, cuando nadie mira, cualquiera puede ser un maltratador.o"));
        fHelperClasses.add(new FHelperClass(R.drawable.violenciagenero, "La violencia machista NO es solo f??sica","Esta campa??a de Kafa, una asociaci??n libanesa que defiende los derechos femeninos y lucha contra la explotaci??n y tr??fico de mujeres, denuncia que los insultos, vejaciones y burlas tambi??n son violencia de g??nero."));
        fHelperClasses.add(new FHelperClass(R.drawable.moratones, "??Rojo violaci??n?? y ??verde sepultura??","En 2012, la agencia francesa BETC y la asociaci??n por los derechos de las mujeres francesas Ni putes Ni Soumises (ni putas ni sumisas) crearon esta campa??a con motivo del D??a Internacional de la Eliminaci??n de la Violencia contra la Mujer de aquel a??o. Las im??genes muestran distintos moratones etiquetados como si de colores Pantone se tratara. ??Rojo violaci??n?? o ??Verde sepultura?? son algunos de los tonos que se pueden leer acompa??ando con una denuncia muy expl??cita contra la violencia machista"));

        adapter = new FeaturedAdapter(fHelperClasses);
        rvFeatured.setAdapter(adapter);



    }

    /*
    public void botonAlerta(View view) {
        TERMINAR : a??adir sonido de alarma al pulsar el bot??n

    }*/

    private class ButtonOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            ImageButton b = (ImageButton) v;
        }
    }
}