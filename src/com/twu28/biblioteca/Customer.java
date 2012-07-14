package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 14/7/12
 * Time: 3:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    /*
    * Was not really asked for;
    * Did not understand the check library card's functionality completely;
    * hence i implemented it by profiling method
    * also this is an invalid comment(sorry for that)
    */

    public static int autoGenId = 0;
    String customerName = "";
    int customerId;
    String libraryNumber = "";

    Customer(String name , String libraryNo)
    {
        this.customerName = name;
        this.libraryNumber = libraryNo;
        autoGenId +=1;
        this.customerId = autoGenId;
    }

    public int getCustomerId()
    {
        return this.customerId;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public String getLibraryNumber()
    {
        return this.libraryNumber;
    }

}
