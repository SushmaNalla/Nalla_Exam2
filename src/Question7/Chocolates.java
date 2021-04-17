/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author Sushma Nalla
 */
public enum Chocolates {
    
    DAIRYMILK(10),MILKYBAR(15),SNICKERS(25);
    int price;

    private Chocolates(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    
}

