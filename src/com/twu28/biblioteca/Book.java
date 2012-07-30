package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 14/7/12
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    String title;
    String isbn;
    String author;
    public boolean isAvailable;

    Book(String name, String id, String author)
    {
        this.isbn = id;
        this.title = name;
        this.author = author;
        this.isAvailable = true;      //Book is available by default when its created for the first time
    }
    public String getIsbn()
    {
        return this.isbn;
    }
    public String getTitle()
    {
        return this.title;
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
