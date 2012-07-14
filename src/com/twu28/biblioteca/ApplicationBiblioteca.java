package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
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
        ArrayList<Book> bookList = new ArrayList<Book>();
        ArrayList<Customer> userList = new ArrayList<Customer>();
        ArrayList<MenuOption> menuOptionList = new ArrayList<MenuOption>();

        bookList.add(new Book("Bourne Identity",1));
        bookList.add(new Book("Bourne Supremacy",2));
        bookList.add(new Book("Bourne Ultimatum",3));
        bookList.add(new Book("Bourne Legacy",4));
        bookList.add(new Book("Bourne Betrayal",5));
        bookList.add(new Book("Bourne Sanction",6));
        bookList.add(new Book("Bourne Deception",7));
        bookList.add(new Book("Bourne Objective",8));

        userList.add(new Customer("Jason Bourne","cia001"));
        userList.add(new Customer("John Michael Kane","cia002"));
        userList.add(new Customer("Pamela 1Landy","cia003"));
        userList.add(new Customer("Ezra Kramer","cia004"));
        userList.add(new Customer("The Professor","cia005"));
        userList.add(new Customer("Mari Krutze","ger001"));

        menuOptionList.add(new MenuOption(1,"View All Books"));
        menuOptionList.add(new MenuOption(2,"Reserve a Book"));
        menuOptionList.add(new MenuOption(3,"Check your library number"));
        menuOptionList.add(new MenuOption(4,"Quit"));

        boolean quit = false;
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(inputStream);



        while(!quit)
        {
            MainMenu.displayMainMenu(menuOptionList);
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
                case 1: MainMenu.displayAllBooks(bookList);
                    break;
                case 2: int enteredBookId = 1; //default book to reserve
                    System.out.println("Enter Book ID of the book to be reserved:");
                    try {
                        enteredBookId = Integer.parseInt(keyboard.readLine());
                    } catch (IOException e) {
                        System.out.println("Error while reading book id");
                    }
                    if(reserveBook(bookList,enteredBookId))
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
                        MainMenu.displayUserMessage(userList,enteredLibraryNo);
                    } catch (IOException e) {
                        System.out.println("Error while reading book id");
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
                default: System.out.println("Invalid Option");
            }

        }






    }

    private static boolean reserveBook(ArrayList<Book> bookList, int bookId) {
        for(Book item:bookList)
        {
            if (item.id == bookId && item.isAvailable)
            {
                item.reserveCopy();
                return true;
            }

        }
        return false;
    }
}
