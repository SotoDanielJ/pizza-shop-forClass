package org.wecancodeit.pizzashop.models;

/**
 * All the pizza in our menu
 */
public class PizzaMenuModel {
    private static long idCounter = 1;
    private long id;
    private String name;
    private String description;
    private double price;
    private String category;
    
    public PizzaMenuModel() {
    }

    public PizzaMenuModel(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.id = idCounter++;
    }

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    

}
