package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 14/7/12
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    String name = "";
    int id ;
    public boolean isAvailable;

    Book(String name, int id)
    {
        this.id = id;
        this.name = name;
        this.isAvailable = true;
    }
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public boolean reserveCopy()
    {
        if(this.isAvailable)         {
            this.isAvailable = false;
            return true;
        }
        return  this.isAvailable;
    }
}
