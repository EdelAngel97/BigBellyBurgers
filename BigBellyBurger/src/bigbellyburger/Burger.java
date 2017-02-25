/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburger;

import java.util.ArrayList;

/**
 *
 * @author LuisGuillermo
 */
public class Burger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
    private String bread;
    private String meat;
    private double price;
    public ArrayList<Ingredient> additions;
    protected int limAdditions;
    
    public Burger(String bread,String meat,double price,int listAdditions){
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        this.limAdditions = 4;
    }
    
    public boolean setAddtion(Ingredient addition){
        if(this.additions.size() < this.limAdditions){
            return additions.add(addition);
        }else{
            System.out.println("Excedio de adiciones");
            return false;
        }
        
    }
    
    public boolean setAddition(String name, double price){
        if(this.additions.size() < this.limAdditions){
            return additions.add(new Ingredient(name,price));
        }else{
            System.out.println("Excedio de adiciones");
            return false;
        }
    }
    public void getTotal(){
        double total = 0;
        System.out.println("this is " + this.meat+ "burger" + " in" 
        + this.bread + " with a base price of " + this.price);
        total+= this.price;
        
        for(Ingredient temp: this.additions){
            System.out.println("plus" + temp.getName() + "at" + temp.getPrice());
            total += temp.getPrice();
                    
        }
        System.out.println("with a grand total of " + total);
    }
}
