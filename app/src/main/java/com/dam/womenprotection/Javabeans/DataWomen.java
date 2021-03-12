package com.dam.womenprotection.Javabeans;

import com.dam.womenprotection.R;

import java.util.ArrayList;

public class DataWomen {

    private ArrayList<Item> datos;

    public DataWomen(){
        datos = new ArrayList<Item>();

        datos.add(new Item(R.drawable.cientificas, "Científicas",
                "La historia está repleta de mujeres que han sido clave en el avance de la ciencia y en la configuración del mundo tal y como lo conocemos. Aunque su reconocimiento ha estado en la sombra durante años y muchas aún sean anónimas, el trabajo de estas 15 mujeres científicas que cambiaron la ciencia es recomendable para estudiar en el aula." +
                        "\n" + "\n" ,"La historia está repleta de mujeres que han sido clave en el avance de la ciencia...."));
        datos.add(new Item(R.drawable.artistas, "Artistas femeninas",
                "Hay 'girl bands' que nos han dejado temazos para el recuerdo, ¿pero qué sabemos realmente de ellas? ¿Cómo se formaron los grupos de chicas que lo 'petaron' en el panorama musical de entonces? Atenta a sus historias.." +
                        "\n" + "\n" ,"13 grupos de chicas que marcaron un antes y después en la música...."));
        //https://delooks.marie-claire.es/lifestyle/ver-y-oir/fotos/girls-bands-de-leyenda-en-la-historia-de-la-musica/1
        datos.add(new Item(R.drawable.porti, "Por ti mujer",
                "Desarrollo de programas y proyectos encaminados fundamentalmente a la prevención, atención e intervención contra la violencia de género hacia la mujer inmigrante.." +
                        "\n" + "\n" ,"Desarrollo de programas y proyectos encaminados fundamentalmente a la prevenció...."));
        //https://asociacionportimujer.org/violencia-de-genero/
        datos.add(new Item(R.drawable.nocolour, "There is no color",
                "La periodista, profesora de la Universitat Oberta de Catalunya, defensora de los derechos humanos, comprometida, Ana Bernal-Triviño, acaba de ser premiada por el Ministerio de Igualdad por su labor en la erradicación de la violencia contra las mujeres. En el siguiente botón pueden acceder al reportaje de este anuncio" +
                        "\n" + "\n" ,"La discriminación positiva corrige situaciones de desigualdad y derriba estereotipos......"));
        //https://www.es.amnesty.org/en-que-estamos/blog/historia/articulo/la-discriminacion-positiva-corrige-situaciones-de-desigualdad-y-derriba-estereotipos/
        datos.add(new Item(R.drawable.withoutcolour, "Share cultures",
                "Desde la huelga sexual de las mujeres de Liberia que allanó el camino hacia la paz, el \"Día Libre de las Mujeres\" en Islandia para reclamar la igualdad económica hasta la repercusión mundial del movimiento #MeToo, la historia nos enseñó que el cambio es posible a través del activismo colectivo.." +
                        "\n" + "\n" ,"Doce pequeñas acciones con gran impacto para Generación Igualdad...."));
        //https://www.unwomen.org/es/news/stories/2020/2/compilation-small-actions-big-impact-for-generation-equality

    }

    public ArrayList<Item> getDatos() {
        return datos;
    }
}
