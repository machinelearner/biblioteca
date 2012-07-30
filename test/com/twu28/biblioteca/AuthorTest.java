package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 30/7/12
 * Time: 9:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class AuthorTest {
    @Test
    public void creationTestWithoutTitle() throws Exception {
        assertEquals("Robert Ludlum", new Author("Robert", "Ludlum").toString());
    }

    @Test
    public void creationTestWithTitle() throws Exception {
        assertEquals("Robert Ludlum",new Author("Mr.","Robert","Ludlum").toString());
    }
}
