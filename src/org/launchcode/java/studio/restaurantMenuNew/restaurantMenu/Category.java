package org.launchcode.java.studio.restaurantMenuNew.restaurantMenu;

public class Category {

    private String description;

    public Category (String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return description;
    }
}
