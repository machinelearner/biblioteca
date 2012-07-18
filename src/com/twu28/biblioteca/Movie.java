package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 18/7/12
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    String name;
    String director;
    String ratings;

    public Movie(String name, String director, String ratings) {
            this.name = name;
            this.director = director;
            this.ratings = ratings;
    }

    @Override
    public String toString() {
        return  name + " "+ director+ " " +ratings ;
    }
}
