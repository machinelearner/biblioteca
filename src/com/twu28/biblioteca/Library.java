package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 16/7/12
 * Time: 9:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    ArrayList<Book> bookList;
    ArrayList<Customer> userList;
    ArrayList<MenuOption> menuOptionList;

    Library()
    {
        this.userList = new ArrayList<Customer>();
        this.bookList = new ArrayList<Book>();
        this.menuOptionList = new ArrayList<MenuOption>();
        this.createBookList();
        this.createUserList();
        this.createMenuOptionList();
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

    public void createUserList()
    {
        this.userList.add(new Customer("Jason Bourne","cia001"));
        this.userList.add(new Customer("John Michael Kane","cia002"));
        this.userList.add(new Customer("Pamela Landy","cia003"));
        this.userList.add(new Customer("Ezra Kramer","cia004"));
        this.userList.add(new Customer("The Professor","cia005"));
        this.userList.add(new Customer("Mari Kruetze","ger001"));
    }

    public void createMenuOptionList()
    {
        this.menuOptionList.add(new MenuOption(1,"View All Books"));
        this.menuOptionList.add(new MenuOption(2,"Reserve a Book"));
        this.menuOptionList.add(new MenuOption(3,"Check your library number"));
        this.menuOptionList.add(new MenuOption(4,"Quit"));
    }

    public boolean reserveBook(String bookId) {
        for(Book item:this.bookList)
        {
            if (item.isbn.equals(bookId) && item.isAvailable)
            {
                item.reserveCopy();
                return true;
            }

        }
        return false;
    }


}
