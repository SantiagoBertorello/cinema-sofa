import com.aluradesafio.cinemasofa.calculos.CalculadoraDeTiempo;
import com.aluradesafio.cinemasofa.modelos.Pelicula;
import com.aluradesafio.cinemasofa.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
     //tipoDedato variable = nuevaInstancia se crea un nuevo espacio en la memoria para almacenar ese nuevo objeto
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
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

        Serie gameOfThrones = new Serie();
        gameOfThrones.setNombre("Game Of Thrones");
        gameOfThrones.setFechaDeLanzamiento(2018);
        gameOfThrones.setTemporadas(6);
        gameOfThrones.setMinutosPorEpisodio(50);
        gameOfThrones.setEpisodiosPorTemporada(7);
        System.out.println(gameOfThrones.getDuracionEnMinutos());
        gameOfThrones.muestraFichaTecnica();





    }
}
