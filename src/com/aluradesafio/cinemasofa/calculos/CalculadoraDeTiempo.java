package com.aluradesafio.cinemasofa.calculos;
import com.aluradesafio.cinemasofa.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
            tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
