public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    float puntaje;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int  totalDeLasEvaluaciones;

    int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    };


    void muestraFichaTecnica(){
        System.out.println("El nombre de la Película es: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
    };
    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
