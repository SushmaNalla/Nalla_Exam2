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
public class Hero extends UrbanBicycle {

    public Hero(int noOfGears) {
        super(noOfGears);
    }

    @Override
    public double calcPrice() {
        return super.calcPrice(); 
    }

    @Override
    public double calcPriceAfterDisc() {
        return super.calcPriceAfterDisc()*3/4; 
    }
    
}
