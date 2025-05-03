package com.aluradesafio.cinemasofa.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificable clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Pelicula con buena evaluación");
        }else if(clasificacion.getClasificacion() >= 2){
            System.out.println("popular en el momento");
        }else {
            System.out.println("Guardala en tu lista para ver más tarde.");
        }

    }
}
