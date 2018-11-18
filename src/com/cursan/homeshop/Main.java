package com.cursan.homeshop;

public class Product {
    String name;
    String description;
    double price;

    public void look() {
        System.out.println(name + ":" + price + "%n" + description);
    }

    public void buy(Bill bill, Integer quantity) {

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

    public void setPrice(double price){
        this.price = price;
    }
}

public class Bill {

}

public class Customer {
    String fullname;
    String address;

    public String getFullname(){
        return fullname;
    }

    public String getAddress(){
        return address;
    }
}