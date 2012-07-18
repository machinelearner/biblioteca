package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 18/7/12
 * Time: 10:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookOperations {
    ArrayList<Book> bookList;
    BookOperations()
    {
        this.bookList = new ArrayList<Book>();
        this.createBookList();
    }

    public void createBookList()
    {
        this.bookList.add(new Book("Bourne Identity", "abcd1"));
        this.bookList.add(new Book("Bourne Supremacy", "abcd2"));
        this.bookList.add(new Book("Bourne Ultimatum", "abcd3"));
        this.bookList.add(new Book("Bourne Legacy","abcd4"));
        this.bookList.add(new Book("Bourne Betrayal", "abcd5"));
        this.bookList.add(new Book("Bourne Sanction", "abcd6"));
        this.bookList.add(new Book("Bourne Deception", "abcd7"));
        this.bookList.add(new Book("Bourne Objective", "abcd8"));

    }

    public void displayAllBooks()
    {
        System.out.println(MainMenu.StarsForDesign+"List of available books"+MainMenu.StarsForDesign);
        System.out.println("Id :::"+"Book Title :::"+"Availability");
        for (Book item : this.bookList) {
            System.out.println(item.getIsbn() + " ::: " + item.getTitle()+" ::: "+item.isAvailable);
        }

    }

    public boolean reserveBook(String isbn) {
        for(Book item:this.bookList)
        {
            if (item.isbn.equals(isbn) && item.isAvailable)
            {
                item.reserveCopy();
                return true;
            }

        }
        return false;
    }

}
