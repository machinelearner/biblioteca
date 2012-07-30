package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 19/7/12
 * Time: 11:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class InputHandler {
    static InputStreamReader inputStream = new InputStreamReader(System.in);
    static BufferedReader keyboard = new BufferedReader(inputStream);

    public static String getMessage()
    {
        try
        {
            return keyboard.readLine();

        }
        catch (Exception e)
        {
            OutputHandler.displayMessage("Error while reading Input");

        }
        return null;
    }
    public static int getValue()
    {
        try
        {
            return Integer.parseInt(keyboard.readLine());

        }
        catch (Exception e)
        {
            OutputHandler.displayMessage("Error while reading Input");

        }
        return -1;
    }
}
