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
        //Añadir todos los post aquí: imagen + title + description
        fHelperClasses1.add(new CHelperClass("¿Qué es libres?",R.drawable.mujereslibres));
        fHelperClasses1.add(new CHelperClass("Estamos contigo",R.drawable.estamoscontigo));
        fHelperClasses1.add(new CHelperClass("¿Qué hacer? " + "\n"+
                "#SeñalDeSocorro'",R.drawable.sos));
        fHelperClasses1.add(new CHelperClass("Herramientas de" + "\n" +
                " auto-protección",R.drawable.autoproteccion));
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
        //Añadir todos los post aquí: imagen + title + description
        fHelperClasses1.add(new MVHelperClass(R.drawable.noviembre25, "XXVI Jornadas Técnicas contra la Violencia de Género:","El 27 de noviembre, la Comisión para la Investigación de Malos Tratos a Mujeres participa en las XXVI Jornadas Técnicas contra la Violencia de Género: Mujeres jóvenes ante la Violencia de Género, organizadas por el Ayuntamiento de Fuenlabrada."));
        fHelperClasses1.add(new MVHelperClass(R.drawable.abolicion, "Presentación de la Ley Orgánica Abolicionista del Sistema Prostitucional","Presentación, el 18 de Noviembre de 18:00 - 20:00, de la Ley Orgánica Abolicionista Del Sistema Prostitucional, una iniciativa del movimiento feminista, en la que más de 100 mujeres y organizaciones hemos trabajado para que este proyecto sea una realidad que pueda cambiar la vida de las mujeres.'https://malostratos.org/event/presentacion-de-la-ley-organica-abolicionista-del-sistema-prostitucional/' "));
        fHelperClasses1.add(new MVHelperClass(R.drawable.marzo8, "Encuentro Abolicionista: juntas al #8M","Las abolicionistas vamos juntas al 8M porque: la prostitución reafirma y perpetúa la desigualdad entre los sexos. La industria sexual es hoy una multinacional más del crimen y la explotación de niñas y mujeres.Nos reuniremos a las 16:00 en la Plaza de Callao."));
        fHelperClasses1.add(new MVHelperClass(R.drawable.mujeresmigrantes, "Mujeres migrantes","Sara Vicente, coordinadora de nuestro equipo en Navarra, impartirá una formación, a partir de las 10:30, sobre ‘Respuestas legales frente a las violencias machistas."));
        fHelperClasses1.add(new MVHelperClass(R.drawable.paloenpalo, "De palo en palo","Visionado del cortometraje 'De Palo en Palo', realizado por la Comisión para la Invetsigación de Malos Tratos a Mujeres, el 28 de Noviembre a las 19:00, Sede de la Asociación MLCD de Camas"));
        fHelperClasses1.add(new MVHelperClass(R.drawable.feminismo, "Presentación del libro “Feminismos”","El martes 26 de febrero, la socióloga Beatriz Ranea estará en Casa del Libro de Gran Vía de Madrid presentando su primer libro, acompañada por las profesoras Rosa Cobo y Luisa Posada Kubissa.Acércate a conocer “Feminismos: Antología de textos feministas para uso de las generaciones más jóvenes y de las que no lo son tanto”."));
        adapter = new MostViewAdapter(fHelperClasses1);
        rvMostView.setAdapter(adapter);

    }

    private void rvFeatured() {

        rvFeatured.setHasFixedSize(true);
        rvFeatured.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        //https://smoda.elpais.com/moda/actualidad/dia-violencia-genero-2016-campanas-reflexionar/

        ArrayList<FHelperClass> fHelperClasses = new ArrayList<>();
        //Añadir todos los post aquí: imagen + title + description
        fHelperClasses.add(new FHelperClass(R.drawable.pakistan, "'Beat me'","Hace unos días, la ONU Mujeres Pakistán lanzaba una potente campaña,envían un potente mensaje contra la violencia machista. «Paradójicamente, la campaña presenta a mujeres que piden a los hombres que las golpeen o las venzan (beat me puede tener ambos significados en inglés) pero en aquello en lo que son buenas. Tiene como objetivo inspirar a las mujeres a reafirmar que son más fuertes de lo que se les hace creer y romper la percepción de que una mujer es débil. "));
        fHelperClasses.add(new FHelperClass(R.drawable.diaviolencia, "«Día de tía buena maciza»","«Eliminar la violencia machista es una lucha de todos los días» es el mensaje de la campaña del Ayuntamiento de Madrid para este 25 de noviembre. La Dirección General de Igualdad y de Medios y la agencia de publicidad Kitchen han ideado una serie de carteles, pulseras, pegatinas y chapas con frases que denuncian la violencia sexual que sufren las mujeres."));
        fHelperClasses.add(new FHelperClass(R.drawable.thedress, "#TheDress","El vestido más viral de 2015 (y probablemente de todos los tiempos) sirvió de percha para esta campaña de la rama de Sudáfrica del Ejército de Salvación (confesión evangelista mucho más conocida por su labor de beneficencia). Bajo el lema #StopAbuseAgainstWomen («parar el abuso contra las mujeres»), La campaña fue muy aplaudida en las redes sociales por su creatividad. Teniendo en cuenta que en Sudáfrica cada seis horas muere una mujer a manos de su pareja (según datos de la ONU), este es el verdadero #thedress que debería hacerse viral."));
        fHelperClasses.add(new FHelperClass(R.drawable.poster, "El póster que muestra la realidad","La organización instaló en Hamburgo (Alemania) el primer póster que responde ante las miradas. Cuando nadie le presta atención, la imagen instalada en marquesinas de la ciudad muestra a un hombre pegando a una mujer. Sin embarg, cuando detecta cualquier mirada, la misma pareja aparece sonriendo. Una idea brillante para recordarnos que, cuando nadie mira, cualquiera puede ser un maltratador.o"));
        fHelperClasses.add(new FHelperClass(R.drawable.violenciagenero, "La violencia machista NO es solo física","Esta campaña de Kafa, una asociación libanesa que defiende los derechos femeninos y lucha contra la explotación y tráfico de mujeres, denuncia que los insultos, vejaciones y burlas también son violencia de género."));
        fHelperClasses.add(new FHelperClass(R.drawable.moratones, "«Rojo violación» y «verde sepultura»","En 2012, la agencia francesa BETC y la asociación por los derechos de las mujeres francesas Ni putes Ni Soumises (ni putas ni sumisas) crearon esta campaña con motivo del Día Internacional de la Eliminación de la Violencia contra la Mujer de aquel año. Las imágenes muestran distintos moratones etiquetados como si de colores Pantone se tratara. «Rojo violación» o «Verde sepultura» son algunos de los tonos que se pueden leer acompañando con una denuncia muy explícita contra la violencia machista"));

        adapter = new FeaturedAdapter(fHelperClasses);
        rvFeatured.setAdapter(adapter);



    }

    /*
    public void botonAlerta(View view) {
        TERMINAR : añadir sonido de alarma al pulsar el botón

    }*/

    private class ButtonOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            ImageButton b = (ImageButton) v;
        }
    }
}