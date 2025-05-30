import com.aluradesafio.cinemasofa.calculos.CalculadoraDeTiempo;
import com.aluradesafio.cinemasofa.modelos.Episodio;
import com.aluradesafio.cinemasofa.modelos.Pelicula;
import com.aluradesafio.cinemasofa.modelos.Serie;
import com.aluradesafio.cinemasofa.calculos.FiltroRecomendacion;
import com.aluradesafio.cinemasofa.modelos.Titulo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
     //tipoDedato variable = nuevaInstancia se crea un nuevo espacio en la memoria para almacenar ese nuevo objeto
        Pelicula miPelicula = new Pelicula("Encanto",2006);

        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7);
        miPelicula.evalua(10);
        miPelicula.evalua(8.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de las notas: " + miPelicula.calculaMedia());
        System.out.println("El nombre de la pelicula ingresado es: " + miPelicula.getNombre());
        System.out.println("Se encuentra incluido en el plan: " + miPelicula.isIncluidoEnElPlan());

        Serie gameOfThrones = new Serie("Game Of Thrones",2018);
        gameOfThrones.setTemporadas(6);
        gameOfThrones.setMinutosPorEpisodio(50);
        gameOfThrones.setEpisodiosPorTemporada(7);
        System.out.println(gameOfThrones.getDuracionEnMinutos());
        gameOfThrones.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(gameOfThrones);

        System.out.println(calculadora.getTiempoTotal());


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Winter Is Coming");
        episodio.setSerie(gameOfThrones);
        episodio.setTotalVisualizaciones(400);

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        filtroRecomendacion.filtra(miPelicula);
        filtroRecomendacion.filtra(episodio);

        var otraPelicula = new Pelicula("El señor de los Anillos", 2001);
        otraPelicula.setDuracionEnMinutos(180);

        var nuevaPelicula = new Pelicula("Gladiador", 2002);

        nuevaPelicula.setDuracionEnMinutos(140);

        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(nuevaPelicula);
        listaPeliculas.add(miPelicula);
        listaPeliculas.add(otraPelicula);

        System.out.println("tamaño de la lista: " + listaPeliculas.size());
        System.out.println("nompre de la primer pelicula: "+ listaPeliculas.get(0).getNombre()) ;


        System.out.println(listaPeliculas.toString());
        System.out.println("toString de la pélicula: " + listaPeliculas.get(0).toString());

        // Verificamos si la lista contiene una película específica
        System.out.println("¿La lista contiene Gladiador? " + listaPeliculas.contains(nuevaPelicula));

        // Reemplazamos una película en cierta posición .
        Pelicula peliculaReemplazo = new Pelicula("Matrix",1998);

        peliculaReemplazo.setDuracionEnMinutos(136);
        listaPeliculas.set(1, peliculaReemplazo);

        // Imprimimos la lista después del reemplazo
        System.out.println("Lista después del reemplazo:");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.getNombre());
        }

        /*
        listaPeliculas.remove(0); // Elimina la película en el índice 0
        System.out.println("Lista después de eliminar la primera película:");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.getNombre());
            }


        // Limpiar toda la lista
        listaPeliculas.clear();
        System.out.println("¿La lista está vacía ahora? " + listaPeliculas.isEmpty());
        */


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(nuevaPelicula);
        lista.add(gameOfThrones);//serie
        lista.add(otraPelicula);

        lista.forEach(System.out::println);

        System.out.println("\n################\n");

        for( Titulo item: lista){
            System.out.println(item.getNombre());
            if(item instanceof Pelicula){
                Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());
            }
        }

    }




}
