package com.rhtect.demo;

public class MovieOperator {
    private Movie[] Movices;

    public MovieOperator(Movie[] movices) {
        Movices = movices;
    }

    public void ShowAllMovies(){
        System.out.println("-----------Today-show-movies-----------");
        for (int i = 0; i < Movices.length; i++) {
            System.out.println(Movices[i].getId());
            System.out.println(Movices[i].getName());
            System.out.println(Movices[i].getActor());
            System.out.println(Movices[i].getPrice());
            System.out.println(Movices[i].getScore());
            System.out.println(Movices[i].getDescription());
        }
    }
}
