/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburger;

/**
 *
 * @author LuisGuillermo
 */
public class DeluxeBurger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public DeluxeBurger(String bread, String meat, double price, int listAdditions,
            Ingredient addition1,Ingredient addition2) {
        super(bread, meat, price, listAdditions);
        limAdditions = 2;
        this.setAddition(addition1);
        this.setAddition(addition2);
    }

    public DeluxeBurger(String bread, String meat, double price, int listAdditions,String name1,
            double price1,String name2,double price2) {
        super(bread, meat, price, listAdditions);
        limAdditions = 2;
        this.setAddition(name1,price1);
        this.setAddition(name2,price2);
    }
    
    @Override
    public void getTotal(){
        System.out.println("This is a deluxe burger");
        super.getTotal();
    }

}
