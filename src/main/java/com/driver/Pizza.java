package com.driver;

public class Pizza {
    private final int price;
    boolean isVeg;
    private String bill;
    private boolean extraCheese = false;
    private int extraCheesePrice;
    private  boolean extraTopping = false;
    int toppingPrice;
    boolean takeAway = false;
    int bagPrise = 20;
    private int totalPrice ;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
            this.toppingPrice =70;
        }
        else {
            this.price = 400;
            this.toppingPrice = 120;
        }
        totalPrice =this.price;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.extraCheese){ // no extra cheese
            this.extraCheese = true;
            extraCheesePrice = 80;
            totalPrice+= extraCheesePrice;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes her
        if(!extraTopping) {
            totalPrice+= toppingPrice;
            extraTopping = true;
            extraCheese = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            takeAway=true;
            this.totalPrice+=this.bagPrise;
        }
    }

    public String getBill(){
        // your code goes here
        StringBuilder sb = new StringBuilder();
        sb.append("Base Price Of The Pizza:").append(price).append("/n");
        if(extraCheese){
            sb.append("Extra Cheese Added:").append(extraCheesePrice).append("/n");
        }
        if(extraTopping){
            sb.append("Extra Toppings Added:").append(toppingPrice).append("/n");
        }
        if(takeAway){
            sb.append("Paperbag Added:").append(bagPrise).append("/n");
        }
        sb.append("Total Price:").append(totalPrice).append("/n");
        this.bill = sb.toString();
        return this.bill;
    }
}
