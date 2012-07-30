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
    public static String displayMessage(String message)
    {
        System.out.println(message);
        return message;
    }

    public static String displayErrorMessage(String message)
    {
        System.out.println("Error!!");
        System.out.println(message);
        return "Error!!\n"+message;
    }
}
