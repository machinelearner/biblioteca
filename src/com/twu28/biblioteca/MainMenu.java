package com.twu28.biblioteca;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 14/7/12
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainMenu {

    public static final String WelcomeMessage = "Welcome To Biblioteca";
    public static final String DescriptionMessage = "Bangalore's Public Library System";
    public static final String StarsForDesign = "**************************";


    public static void displayMainMenu(ArrayList<MenuOption> MenuOptions)
    {
        System.out.println(StarsForDesign+WelcomeMessage+StarsForDesign);
        System.out.println("\n");
        System.out.println(DescriptionMessage);
        System.out.println("\n");
        System.out.println(StarsForDesign+StarsForDesign+StarsForDesign);
        System.out.println("Select an option from the menu below");
        System.out.println(StarsForDesign+"Menu"+StarsForDesign);
        System.out.println("===============================================================================");
        for (MenuOption item : MenuOptions) {
            System.out.println(item.getOptionId() + "::: " + item.getOptionValue());
        }
        System.out.print("Enter Your Option:: ");
    }

    public static void displayAllBooks(ArrayList<Book> Books)
    {
        for (Book item : Books) {
            System.out.println(StarsForDesign+"List of available books"+StarsForDesign);
            System.out.println(item.getId() + " ::: " + item.getName()+" ::: "+item.isAvailable);
        }

    }

    //part of menu handling and display and is not associated with any object in particular
    public static void displayUserMessage(ArrayList<Customer> users,String libraryNo )
    {
        for( Customer item:users)
        {
            if(item.libraryNumber.equals(libraryNo))
            {
                System.out.println("Please talk to Librarian. Thank you.");
                return;
            }
        }
        System.out.println("Invalid Library Number");
        return;


    }
}
