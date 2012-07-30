package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 30/7/12
 * Time: 8:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Author {
    String firstName, lastName,title=new String("Mr.");

    public Author(String title,String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString()
    {
        return this.firstName +" "+ this.lastName;
    }
}
