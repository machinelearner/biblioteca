package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 18/7/12
 * Time: 2:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieOperations {
    ArrayList<Movie> movieList;
    MovieOperations()
    {
     this.movieList = new ArrayList<Movie>();
     this.createMoviesList();
    }
    private void createMoviesList()
    {
        this.movieList.add(new Movie("The Prestige","Christopher Nolan","*********"));
        this.movieList.add(new Movie("Batman Begins","Christopher Nolan","*********"));
        this.movieList.add(new Movie("The Dark Knight","Christopher Nolan","*********"));
        this.movieList.add(new Movie("Inception","Christopher Nolan","********"));
        this.movieList.add(new Movie("Oceans 11","Steven Soderbergh","*********"));
        this.movieList.add(new Movie("Oceans 12","Steven Soderbergh","*********"));
        this.movieList.add(new Movie("Oceans 13","Steven Soderbergh","*********"));
        this.movieList.add(new Movie("Bourne Identity","Doug Liman","*********"));
        this.movieList.add(new Movie("Bourne Supremacy","Paul Greengrass","********"));
        this.movieList.add(new Movie("Bourne Ultimatum","Paul Greengrass","*********"));
        this.movieList.add(new Movie("The God Father","Francis Ford Coppola","*********"));
        this.movieList.add(new Movie("Good Will Hunting","Gus Van Sant","*********"));
        this.movieList.add(new Movie("Body of lies","Ridley Scott","********"));
        this.movieList.add(new Movie("Shawshank Redemption","Frank Darabont","*********"));
        this.movieList.add(new Movie("Disturbia","D.J. Caruso","*******"));
        this.movieList.add(new Movie("Dark Knight Rises","Christopher Nolan","N/A"));
    }


    public void displayAllMovies() {

        for(Movie item:movieList)
        {
            OutputHandler.displayMessage(item.toString());
        }

    }
}
