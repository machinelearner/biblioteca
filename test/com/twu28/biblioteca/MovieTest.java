package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 27/7/12
 * Time: 7:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {
    @Test
    public void movieWithRatingTest() throws Exception {
        assertEquals("A Few Good Men Rob Reiner ********",new Movie("A Few Good Men", "Rob Reiner","********").toString());
    }

    @Test
    public void movieWithoutRatingTest() throws Exception {
        assertEquals("A Few Good Men Rob Reiner N/A",new Movie("A Few Good Men", "Rob Reiner","N/A").toString());
    }
}
