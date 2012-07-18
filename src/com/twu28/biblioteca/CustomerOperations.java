package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 18/7/12
 * Time: 9:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerOperations {
    ArrayList<Customer> userList;

    CustomerOperations()
    {
        this.userList = new ArrayList<Customer>();
        createUserList();
    }
    public void createUserList()
    {
        this.userList.add(new Customer("Jason Bourne","admin"));
        this.userList.add(new Customer("John Michael Kane","admin"));
        this.userList.add(new Customer("Pamela Landy","admin"));
        this.userList.add(new Customer("Ezra Kramer","admin"));
        this.userList.add(new Customer("The Professor","admin"));
        this.userList.add(new Customer("Mari Kruetze","admin"));
    }

    public void makeLibrarian(Customer user)
    {
        user.isLibrarian = true;

        if(Customer.librarian == null)
        {
            Customer.librarian = user;
        }
        else
        {    //change the previous librarian to non librarian and assign current librarian's library number to previous
            Customer.librarian.isLibrarian = false;
            Customer.librarian.libraryNumber = user.libraryNumber;
        }
        user.libraryNumber = new String("111-1111");

    }

    public Customer loginCheck(String username, String password)
    {
        Customer searched = searchUserList(username);
        if(searched != null)
        {
            if(searched.getPassword().equals(password))
            {
                searched.isLoggedIn = true;
                return searched;
            }
        }
        return null;
    }

    private Customer searchUserList(String username) {
        for(Customer item:this.userList)
        {
            if(item.getLibraryNumber().equals(username))
                return item;
        }

        return null;
    }

}
