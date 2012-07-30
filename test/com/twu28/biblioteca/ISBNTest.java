package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 30/7/12
 * Time: 9:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class ISBNTest {
    @Test
    public void testInvalid() throws Exception {
        ISBN number = new ISBN("0306404155");
        assertEquals(false,number.isValid());
    }

    @Test
    public void testValid() throws Exception {
        ISBN number = new ISBN("0306406152");
        assertEquals(true,number.isValid());
    }

}
