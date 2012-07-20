package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 19/7/12
 * Time: 11:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class OutputHandler {
    public static void displayMessage(String message)
    {
        System.out.println(message);
    }
    public static void displayMessage(ArrayList<String> messages)
    {
        for(String message: messages)
        {
            System.out.println(message);
        }
    }
    public static void displayErrorMessage(String message)
    {
        System.out.println("Error!!");
        System.out.println(message);
    }
}
