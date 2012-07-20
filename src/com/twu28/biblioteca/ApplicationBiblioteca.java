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
        MainMenu menuInstance = new MainMenu();
        Customer currentCustomer = null;


        while(!quit)
        {
            menuInstance.displayMainMenu();
            int enteredOption = -1; // default invalid option
            try
            {
                enteredOption = Integer.parseInt(InputHandler.getMessage());

            }
            catch (Exception e)
            {
                OutputHandler.displayErrorMessage("Error Reading Input");
            }

            switch (enteredOption)
            {
                case 1: libraryInstance.getManageBooks().displayAllBooks();
                    break;

                case 2:
                    if(currentCustomer != null && currentCustomer.isLoggedIn)
                    {
                        String enteredBookId = "abcd1"; //default book to reserve
                        OutputHandler.displayMessage("Enter ISBN of the book to be reserved:");
                        enteredBookId = InputHandler.getMessage();
                        if(libraryInstance.getManageBooks().reserveBook(enteredBookId))
                        {
                            OutputHandler.displayMessage("Thank You! Enjoy the book.");
                        }
                        else
                        {
                            OutputHandler.displayMessage("Sorry we don't have that book yet.");
                        }

                    }
                    else
                        OutputHandler.displayMessage("You need to log in to use this facility");
                    break;

                case 3:   libraryInstance.getManageMovies().displayAllMovies();
                    break;

                case 4:
                    if(currentCustomer != null && currentCustomer.isLoggedIn)
                    {
                        OutputHandler.displayMessage("Your Library Number Is:");
                        OutputHandler.displayMessage(currentCustomer.getLibraryNumber());
                    }
                    else
                        OutputHandler.displayMessage("Please Talk to the Librarian");
                    break;

                case 5:
                    String username=null,password=null;
                    OutputHandler.displayMessage("Enter Your Username");
                    username = InputHandler.getMessage();
                    OutputHandler.displayMessage("Enter Your password");
                    password = InputHandler.getMessage();
                    Customer searchedUser = libraryInstance.manageCustomers.loginCheck(username,password);
                    if(searchedUser !=null) {
                        OutputHandler.displayMessage("Login Successful");
                        currentCustomer = searchedUser;
                    }
                    else {
                        OutputHandler.displayMessage("Invalid Username or password");
                    }
                    break;

                case 6: OutputHandler.displayMessage("Thank You for using the service!!");
                    try {
                        Thread.sleep(5000);
                    }
                    catch (InterruptedException ex)
                    {
                    }
                    quit = true;
                    break;

                default: OutputHandler.displayMessage("Invalid Option\n Select a valid option!");
            }

        }






    }

}
