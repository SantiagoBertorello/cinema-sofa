import com.aluradesafio.cinemasofa.modelos.Pelicula;
import com.aluradesafio.cinemasofa.modelos.Serie;
import com.aluradesafio.cinemasofa.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalLista {
    public static void main (String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2006);
        miPelicula.evalua(6);
        Serie gameOfThrones = new Serie("Game Of Thrones", 2018);
        Serie otraSerie = new Serie("True Detective", 2014);
        Serie superSerie = new Serie ("Breaking Bad", 2018);
        Pelicula otraPelicula = new Pelicula("El señor de los Anillos", 2001);
        otraPelicula.evalua(6);

        Pelicula nuevaPelicula = new Pelicula("Gladiador", 2002);
        nuevaPelicula.evalua(5);

        Pelicula p1 = otraPelicula;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(nuevaPelicula);
        lista.add(gameOfThrones);
        lista.add(otraSerie);
        lista.add(superSerie);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 5) {
                System.out.println(pelicula.getClasificacion());
                System.out.println("Clasificacion: " + pelicula.getClasificacion());
            }
        }
        System.out.println("\n ############");
        System.out.println("\n Lista Títulos:");
        lista.forEach(System.out::println);
        System.out.println("\n ############");
        System.out.println("Lista Titulos Ordenada:");
        Collections.sort(lista);
        lista.forEach(System.out::println);



        ArrayList<String> listaActores = new ArrayList<>();

        listaActores.add("Ricardo Darín");
        listaActores.add("Monica Astur");
        listaActores.add("Diego Monta");
        listaActores.add("Robert De Niro");
        listaActores.add("Dicaprio");
        listaActores.add("Angeline Jolie");


        System.out.println("\n ############");
        System.out.println("\n Lista Actores:");
        listaActores.forEach(System.out::println);
        System.out.println("\n ############");
        System.out.println("Lista Actores Ordenada:");
        Collections.sort(listaActores);
        listaActores.forEach(System.out::println);



    }
}
