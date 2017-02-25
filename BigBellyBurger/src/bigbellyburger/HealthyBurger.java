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
public class HealthyBurger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public HealthyBurger(String bread, String meat, double price, int listAdditions) {
        super(bread, meat, price, listAdditions);
        limAdditions = 4;
    }
    
    @Override
    public void getTotal(){
        System.out.println("This is a healthy burger");
    }
}
