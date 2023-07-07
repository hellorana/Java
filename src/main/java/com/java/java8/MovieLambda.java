package com.java.java8;

import java.util.*;

public class MovieLambda {

    public static void main(String[] args) {

        Movie m1 = new Movie("Inception",100);
        Movie m2 = new Movie("Godfather",200);
        Movie m3 = new Movie("Spiderman",250);
        Movie m4 = new Movie("Love",350);

        List<Movie> movieList = new ArrayList<>();
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);

        // using iterator
        // before sorting
        System.out.println("Before Sorting : ---------------------------------------");
        Iterator<Movie> movieListIterator = movieList.iterator();
        while(movieListIterator.hasNext()){
            System.out.println(movieListIterator.next());
        }

        // using forEach
        //System.out.println("Iterations using forEach and Lammbda : ");

        //Old way for sorting

        Collections.sort(movieList, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getMovieName().compareTo(o2.getMovieName());
            }
        });

        //lambda sorting
        Collections.sort(movieList,(o1,o2)->o1.getMovieName().compareTo(o2.getMovieName()));

        // after sorting
        System.out.println("After Sorting : --------------------------------------------");
        Iterator<Movie> movieListIteratorSorted = movieList.iterator();
        while(movieListIteratorSorted.hasNext()){
            System.out.println(movieListIteratorSorted.next());
        }

    }
}
