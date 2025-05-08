package com.aluradesafio.cinemasofa.modelos;

import com.aluradesafio.cinemasofa.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int)  calculaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Película: " + this.getNombre() + " (" + getFechaDeLanzamiento()  + ")";
    }
}