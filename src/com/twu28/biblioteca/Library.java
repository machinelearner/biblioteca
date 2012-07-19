package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 16/7/12
 * Time: 9:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class Library {

    CustomerOperations manageCustomers;
    BookOperations manageBooks ;
    MainMenu manageMenu;
    MovieOperations manageMovies;
    public static  final String LibraryNumberSeriesInitial;

    static {
        LibraryNumberSeriesInitial = "111-1111";
    }

    Library()
    {
       this.manageBooks = new BookOperations();
       this.manageCustomers = new CustomerOperations();
       this.manageMenu = new MainMenu();
       this.manageMovies = new MovieOperations();
    }

    public static String generateNewLibraryNumber(int count) {

        if(count==0)
            return "111-1111";

        if(count==1)
            return "111-1112";

        int firstHalfOfLibraryNumber, secondHalfOfLibraryNumber;
        firstHalfOfLibraryNumber = Integer.parseInt(LibraryNumberSeriesInitial.split("-")[0]);
        secondHalfOfLibraryNumber = Integer.parseInt(LibraryNumberSeriesInitial.split("-")[1]);
        int remainder = count % 8890;
        int quotient = count/8890;
        secondHalfOfLibraryNumber += remainder;
        if(secondHalfOfLibraryNumber > 9999)
        {
            // start over with 1111 in the second half and increment the first half
            secondHalfOfLibraryNumber = 1111;
            firstHalfOfLibraryNumber +=(quotient+1) ;
        }

        return firstHalfOfLibraryNumber+"-"+ secondHalfOfLibraryNumber;

    }


    public MovieOperations getManageMovies() {
        return manageMovies;
    }
}
