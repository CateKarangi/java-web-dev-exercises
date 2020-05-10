package org.launchcode.java.studio.restaurantMenu;

import org.launchcode.java.studio.restaurantMenuNew.restaurantMenu.Category;
import org.launchcode.java.studio.restaurantMenuNew.restaurantMenu.FoodItem;

import java.util.ArrayList;

public class MenuItem {

    private final String description;
    private float cost;

    private String name;
    private String Description;
    private Boolean isNew;
    private Category category;
    private ArrayList<FoodItem> ingredients;

    public MenuItem (String name, String description, float cost, Category category) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.isNew = true;
        this.category = category;
    }

    // Add getters and setters
    public String getDescription(){
    return description;
    }

    public float getCost(){
        return cost;
    }
    public String getName(){return name;}

    public Boolean getIsNew(){return isNew;}

    public Category getCategory(){return category;}

    public ArrayList<FoodItem> getIngredients() {
        return ingredients;
    }
    @Override
    public boolean equals (Object obj){
        MenuItem menuItem = (MenuItem) obj;
        if (menuItem == null){
            return false;
        }
        return this.name.toLowerCase().equals(menuItem.name.toLowerCase());
    }
}