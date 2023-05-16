package com.driver;

public class Pizza {
    private int price;
    boolean isVeg;
    private int vegBasePrise ;
    private int nonVegBasePrise ;
    private String bill;
    private boolean isExtraCheeseAdded;
    private int extraCheesePrice ;
    private  boolean extraToppingAdded ;
     private int toppingPrice ;
    boolean takeAway ;
    private int bagPrise ;
    private boolean billGenerated ;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        vegBasePrise = 300;
        nonVegBasePrise = 400;
        extraCheesePrice = 80;
        toppingPrice = 0;
        bagPrise = 20;
        isExtraCheeseAdded = false;
        extraToppingAdded = false;
        takeAway = false;
        billGenerated = false;
        //price = isVeg?vegBasePrise:nonVegBasePrise;
       // bill="Base Price Of The Pizza: "+price+"\n";
        // your code goes here
    }

    public int getPrice(){
        price = isVeg?vegBasePrise:nonVegBasePrise;
        if(this.isExtraCheeseAdded){
            price+=extraCheesePrice;
        }
        if(this.extraToppingAdded){
            price+=toppingPrice;
        }
        if(this.takeAway){
            price+=bagPrise;
        }
        return price;
    }

    public void addExtraCheese(){
       if(!this.isExtraCheeseAdded){
          this.isExtraCheeseAdded = true;
       }
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes her

        if (!extraToppingAdded) {
            this.toppingPrice =isVeg?70:120;
            this.extraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            this.takeAway=true;
        }
    }
    public String getBill () {

        bill="Base Price Of The Pizza: "+(isVeg?vegBasePrise:nonVegBasePrise)+"\n";
        if(isExtraCheeseAdded){
            bill+="Extra Cheese Added: "+extraCheesePrice+"\n";
        }
        if(extraToppingAdded){
            bill+="Extra Toppings Added: "+toppingPrice+"\n";
        }
        if(takeAway){
            bill+="Paperbag Added: "+bagPrise+"\n";
        }
        price = 0;
        int myprice = getPrice();
        bill+="Total Price: "+myprice+"\n";
        return this.bill;
    }
}
