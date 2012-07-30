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

public class BookTest {

    @Test
    public void creationTest() throws Exception {
          Book book = new Book("Book Name","1235",new Author("Eric","Lustbader"));
        assertEquals("Book Name 1235 Eric Lustbader true",book.toString());
        book.reserveCopy();
        //existence test after reserve
        assertEquals("Book Name 1235 Eric Lustbader false",book.toString());
    }

    @Test
    public void bookReserveTrivialTestForNewBook() throws Exception {
       assertEquals(true, new Book("New Book","abcd9",new Author("Eric","Lustbader")).reserveCopy());
    }


    @Test
    public void bookReserveTestForBookAlreadyBorrowed() throws Exception {
        Book book= new Book("Time pass", "abcd12",new Author("Eric","Lustbader"));
        book.reserveCopy();
        assertEquals(false, book.reserveCopy());

    }
}
