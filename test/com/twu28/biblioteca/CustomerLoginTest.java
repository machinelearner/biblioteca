package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 18/7/12
 * Time: 6:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerLoginTest {
    @Test
    public void loginCheckTest() throws Exception {
        //passing test i.e positive test checking with existing user
        CustomerOperations customerOperationsInstance = new CustomerOperations();
        Customer customer = new Customer("user1","password");
        customerOperationsInstance.userList.add(customer);
        customerOperationsInstance.userList.add(new Customer("user2","password"));
        customerOperationsInstance.userList.add(new Customer("user3","password"));
        customerOperationsInstance.userList.add(new Customer("user4","password"));
        assertEquals(customer, customerOperationsInstance.loginCheck(customer.getLibraryNumber(), "password"));
        assertEquals(customer,customerOperationsInstance.loginCheck("111-1118","password"));
    }

    @Test
    public void UserDoesNotExistLoginCheckTest() throws Exception {

        //negative test checking with invalid username and password
        assertEquals(null,new CustomerOperations().loginCheck("221-1111","password"));
    }

    @Test
    public void WrongPasswordLoginCheckTest() throws Exception {
        // negative test, valid username invalid password
        assertEquals(null,new CustomerOperations().loginCheck("111-1113","password"));
    }
}
