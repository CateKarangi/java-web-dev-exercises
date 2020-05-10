package org.launchcode.java.studio.restaurantMenu;

import  org.launchcode.java.studio.restaurantMenuNew.restaurantMenu.MenuItem;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private Date lastModified;
    private ArrayList<MenuItem> menuItems;

    public Menu(String name, Date lastModified, ArrayList<MenuItem> MenuItems) {
        this.name = name;
        this.lastModified = lastModified;
        this.menuItems = menuItems;

    }

    public void print() {
        System.out.println(name);

    }

    @Override
    public String toString() {
        String result = name + "\r\n";

        result += "Last Modified: " + lastModified.toString() + "\r\n";
        for (MenuItem menuItem : menuItems) {
            result += menuItem;
        }
        return result;
    }

    public Date getLastModified(){
        return lastModified;
    }


}



