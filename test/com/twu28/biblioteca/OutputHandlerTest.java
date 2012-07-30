package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 30/7/12
 * Time: 8:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class OutputHandlerTest {
    @Test
    public void messageDisplayTest() throws Exception {
        String message = "Message to be printed";
        assertEquals(message, OutputHandler.displayMessage(message));
    }

    @Test
    public void errorDisplayTest() throws Exception {
        String error = "This is an error string";
        String errorMessage = "Error!!\n"+error;
        assertEquals(errorMessage, OutputHandler.displayErrorMessage(error));
    }
}
