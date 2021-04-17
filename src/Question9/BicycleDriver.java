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
public class BicycleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LadyBird obj1 = new LadyBird(3);
        System.out.println(obj1.toString());
        UrbanBicycle obj2 = new Hero(2);
        System.out.println("Price After discount = "+obj2.calcPriceAfterDisc());
    }
    
}
