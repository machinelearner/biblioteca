package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 14/7/12
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class MenuOption {
    int optionId = 0;
    String optionValue="";
    MenuOption(int id, String value)
    {
        this.optionId=id;
        this.optionValue=value;
    }
    int getOptionId()
    {
        return this.optionId;
    }
    String getOptionValue()
    {
        return this.optionValue;
    }
}
