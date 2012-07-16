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



        while(!quit)
        {
            MainMenu.displayMainMenu(libraryInstance.menuOptionList);
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
                case 1: MainMenu.displayAllBooks(libraryInstance.bookList);
                    break;

                case 2: String enteredBookId = "abcd1"; //default book to reserve
                    System.out.println("Enter Book ISBN of the book to be reserved:");
                    try {
                        enteredBookId = keyboard.readLine();
                    } catch (IOException e) {
                        System.out.println("Error while reading book isbn");
                    }
                    if(libraryInstance.reserveBook(enteredBookId))
                    {
                        System.out.println("Thank You! Enjoy the book.");
                    }
                    else
                    {
                        System.out.println("Sorry we don't have that book yet.");
                    }
                    break;

                case 3: String enteredLibraryNo = "cia001"; // default customer library number
                    System.out.println("Enter Your Library Number:");
                    try {
                        enteredLibraryNo = keyboard.readLine();
                        MainMenu.displayUserMessage(libraryInstance.userList,enteredLibraryNo);
                    } catch (IOException e) {
                        System.out.println("Error while reading book isbn");
                    }
                    break;

                case 4: System.out.println("Thank You for using the service!!");
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
