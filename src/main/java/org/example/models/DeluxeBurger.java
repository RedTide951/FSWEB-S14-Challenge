package org.example.models;

public class DeluxeBurger extends Hamburger{

    private String cips;
    private String drink;

    public DeluxeBurger(String name, String meat, String breadRollType) {
        super(name, meat, 19.10, breadRollType);
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public DeluxeBurger() {
        super("name", "meat", 19.10, "breadRollType");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }


}
