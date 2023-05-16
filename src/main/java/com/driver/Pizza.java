package com.driver;

public class Pizza {
    private static int price;
    boolean isVeg;

    public int getToppingPrice() {
        return toppingPrice;
    }

    public int getNonVegBasePrise() {
        return nonVegBasePrise;
    }

    public void setNonVegBasePrise(int nonVegBasePrise) {
        this.nonVegBasePrise = nonVegBasePrise;
    }

    public int getVegBasePrise() {
        return vegBasePrise;
    }

    public void setVegBasePrise(int vegBasePrise) {
        this.vegBasePrise = vegBasePrise;
    }

    public int getExtraCheesePrice() {
        return extraCheesePrice;
    }

    public void setExtraCheesePrice(int extraCheesePrice) {
        this.extraCheesePrice = extraCheesePrice;
    }

    public int getBagPrise() {
        return bagPrise;
    }

    public void setBagPrise(int bagPrise) {
        this.bagPrise = bagPrise;
    }

    public void setToppingPrice(int toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    private int vegBasePrise = 300;
    private int nonVegBasePrise = 400;
    private String bill;
    private boolean isExtraCheeseAdded = false;
    private int extraCheesePrice = 80;
    private  boolean extraToppingAdded = false;
     private int toppingPrice = 120;
    boolean takeAway = false;
    int bagPrise = 20;
    private boolean billGenerate = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        price = isVeg?vegBasePrise:nonVegBasePrise;
        bill="Base Price Of The Pizza: "+price+"\n";
        // your code goes here
    }

    public int getPrice(){
        if(isExtraCheeseAdded){
            price+=extraCheesePrice;
            bill+="Extra Cheese Added: "+extraCheesePrice+"\n";
        }
        if(extraToppingAdded){
            price+=toppingPrice;
            bill+="Extra Toppings Added: "+toppingPrice+"\n";
        }
        if(takeAway){
            price+=bagPrise;
            bill+="Paperbag Added: "+bagPrise+"\n";
        }
        return price;
    }

    public void addExtraCheese(){
       if(!isExtraCheeseAdded){
           isExtraCheeseAdded = true;
       }
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes her
        if(!extraToppingAdded) {
            extraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            takeAway=true;
        }
    }
        public String getBill () {
           bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}
