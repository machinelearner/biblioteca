package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 14/7/12
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainMenu {

    public static final String WelcomeMessage = "Welcome To Biblioteca";
    public static final String DescriptionMessage = "Bangalore's Public Library System";
    public static final String StarsForDesign = "**************************";
    ArrayList<MenuOption> menuOptionList;

    MainMenu()
    {
        this.menuOptionList = new ArrayList<MenuOption>();
        this.createMenuOptionList();
    }

    public void createMenuOptionList()
    {
        this.menuOptionList.add(new MenuOption(1,"View All Books"));
        this.menuOptionList.add(new MenuOption(2,"Reserve a Book"));
        this.menuOptionList.add(new MenuOption(3,"View All Movies"));
        this.menuOptionList.add(new MenuOption(4,"Check your library number"));
        this.menuOptionList.add(new MenuOption(5,"Log In"));
        this.menuOptionList.add(new MenuOption(6,"Quit"));
    }


    public void displayMainMenu()
    {
        OutputHandler.displayMessage(StarsForDesign+WelcomeMessage+StarsForDesign);
        OutputHandler.displayMessage("\n");
        OutputHandler.displayMessage(DescriptionMessage);
        OutputHandler.displayMessage("\n");
        OutputHandler.displayMessage(StarsForDesign+StarsForDesign+StarsForDesign);
        OutputHandler.displayMessage("Select an option from the menu below");
        OutputHandler.displayMessage(StarsForDesign+"Menu"+StarsForDesign);
        OutputHandler.displayMessage("===============================================================================");
        for (MenuOption item : this.menuOptionList) {
            OutputHandler.displayMessage(item.getOptionId() + "::: " + item.getOptionValue());
        }
        OutputHandler.displayMessage("Enter Your Option:: ");
    }

}
