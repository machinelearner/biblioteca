package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 14/7/12
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationBiblioteca {


    public static void main(String[] args)
    {
        Library libraryInstance = new Library();
        boolean quit = false;
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(inputStream);
        MainMenu menuInstance = new MainMenu();
        Customer currentCustomer = null;


        while(!quit)
        {
            menuInstance.displayMainMenu();
            int enteredOption = -1; // default invalid option
            try
            {
                enteredOption = Integer.parseInt(keyboard.readLine());

            }
            catch (Exception e)
            {
                System.out.println("Please enter a valid Option!!");
            }

            switch (enteredOption)
            {
                case 1: libraryInstance.manageBooks.displayAllBooks();
                    break;

                case 2: String enteredBookId = "abcd1"; //default book to reserve
                    System.out.println("Enter ISBN of the book to be reserved:");
                    try {
                        enteredBookId = keyboard.readLine();
                    } catch (IOException e) {
                        System.out.println("Error while reading book isbn");
                    }
                    if(libraryInstance.manageBooks.reserveBook(enteredBookId))
                    {
                        System.out.println("Thank You! Enjoy the book.");
                    }
                    else
                    {
                        System.out.println("Sorry we don't have that book yet.");
                    }
                    break;
                case 3:   libraryInstance.getManageMovies().displayAllMovies();
                    break;

                case 4:
                    if(currentCustomer != null && currentCustomer.isLoggedIn)
                    {
                        System.out.println("Your Library Number Is:");
                        System.out.println(currentCustomer.getLibraryNumber());
                    }
                    else
                        System.out.println("Please Talk to the Librarian");
                    break;

                case 5:
                    String username=null,password=null;
                    System.out.println("Enter Your Username");
                    try {
                        username = keyboard.readLine();
                        } catch (IOException e) {
                        System.out.println("Error while reading username");
                    }
                    System.out.println("Enter Your password");
                    try {
                        password = keyboard.readLine();
                    } catch (IOException e) {
                        System.out.println("Error while reading password");
                    }
                    Customer searchedUser = libraryInstance.manageCustomers.loginCheck(username,password);
                    if(searchedUser !=null) {
                        System.out.println("Login Successful");
                        currentCustomer = searchedUser;
                    }
                    else {
                        System.out.println("Invalid Username or password");
                    }
                    break;


                case 6: System.out.println("Thank You for using the service!!");
                    try {
                        Thread.sleep(5000);
                    }
                    catch (InterruptedException ex)
                    {
                        // do nothing
                    }
                    quit = true;
                    break;

                default: System.out.println("Invalid Option\n Select a valid option!");
            }

        }






    }

}
