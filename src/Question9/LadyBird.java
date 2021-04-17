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
public class LadyBird extends UrbanBicycle{

    public LadyBird(int noOfGears) {
        super(noOfGears);
    }
    
    
    
    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public double calcPrice() {
        return price/2; 
    }

    
    
}
