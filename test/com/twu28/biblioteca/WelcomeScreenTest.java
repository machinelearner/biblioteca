package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 14/7/12
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */

public class WelcomeScreenTest {
    @Test
    public void bookReserveTrivialTestForNewBook() throws Exception {
       assertEquals(true, new Book("New Book",9).reserveCopy());
    }


    @Test
    public void bookReserveTestForBookAlreadyBorrowed() throws Exception {
        Book book= new Book("Time pass",12);
        book.reserveCopy();
        assertEquals(false, book.reserveCopy());

    }
}
