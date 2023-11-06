package org.wecancodeit.pizzashop.Dto;

import org.wecancodeit.pizzashop.models.PizzaMenuModel;

public class PizzaMenuDto {
    private long id;
    private String name;
    private String description;
    private double price;
    private String category;

    public PizzaMenuDto() {
    }

    public PizzaMenuDto(PizzaMenuModel pizzaMenu) {
        this.id = pizzaMenu.getId();
        this.category = pizzaMenu.getCategory();
        this.name = pizzaMenu.getName();
        this.price = pizzaMenu.getPrice();
        this.description = pizzaMenu.getDescription();
    }

    public PizzaMenuModel convertToMenu() {
        PizzaMenuModel menu = new PizzaMenuModel(this.getName(),
                this.getDescription(),
                this.getPrice(),
                this.getCategory());
        menu.setId(this.getId());
        return menu;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
