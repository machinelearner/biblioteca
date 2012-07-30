package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 14/7/12
 * Time: 3:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    public static Customer librarian = null;
    public static int autoGenId = 1;
    String Name = "";
    String password;
    int customerId;
    public boolean isLoggedIn = false;
    boolean isLibrarian = false;
    String libraryNumber;

    Customer(String name, String password )
    {
        this.Name = name;
        this.libraryNumber = Library.generateNewLibraryNumber(autoGenId);
        this.password = password;
        autoGenId +=1;
        this.customerId = autoGenId;
    }

    public String getPassword()
    {
        return this.password;
    }

    public String getLibraryNumber()
    {
        return this.libraryNumber;
    }

}
