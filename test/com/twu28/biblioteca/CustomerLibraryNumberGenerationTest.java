package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 16/7/12
 * Time: 7:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerLibraryNumberGenerationTest {
    @Test
    public void FirstLibraryNumberGenerationTest() throws Exception {
        assertEquals("111-1111", Library.generateNewLibraryNumber(0));

    }

    @Test
    public void SecondLibraryNumberGenerationTest() throws Exception {
        assertEquals("111-1112",Library.generateNewLibraryNumber(1));
    }

    @Test
    public void LibraryNumberGeneration8890ThCustomerTest() throws Exception {
        //because pattern changes from 111-9999 to 112-1111
        assertEquals("112-1111",Library.generateNewLibraryNumber(8889));
    }

    @Test
    public void LibraryNumberGeneration17889theCustomerTest() throws Exception {
        //because pattern changes from 112-9999 to 113-1111
        assertEquals("113-1111", Library.generateNewLibraryNumber(17779));
    }

}
