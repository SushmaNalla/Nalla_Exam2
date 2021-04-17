/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author Sushma Nalla
 */
public abstract class UrbanBicycle implements Bicycle {
    private int noOfGears;

    public UrbanBicycle(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }
    
    @Override
    public double calcPriceAfterDisc(){
        return price - (price*discount)/100;
    }

    @Override
    public double calcPrice(){
        return price/2;
    }

    @Override
    public String toString() {
        return "noOfGears= " + noOfGears +", price after discount= "+ calcPriceAfterDisc();
    }
    
    
    
}
