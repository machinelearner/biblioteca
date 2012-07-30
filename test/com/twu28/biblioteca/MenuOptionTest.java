package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 30/7/12
 * Time: 8:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class MenuOptionTest {
    MenuOption option = new MenuOption(5,"New option coming soon");
    @Test
    public void idTest() throws Exception {
        assertEquals(5, option.getOptionId());
    }

    @Test
    public void valueTest() throws Exception {
        assertEquals("New option coming soon",option.getOptionValue());
    }
}
