/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Example2;

/**
 *
 * @author Sushma Nalla
 */
public class NestleProductDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Maggie obj1 = new Maggie(250,10,25);
        System.out.println("---------------------------------------------------");
        System.out.println("This is an example for Inheritance");
        System.out.println(obj1.toString());// inheritance
        System.out.println("Price After discount is "+obj1.PriceAfterdisc());// inheritance
        System.out.println("---------------------------------------------------");
        NestleProduct obj2 = new Maggie(500,20,50);// Polymorphic Substitution
        System.out.println("This is an example for Late binding polymorphism");
        System.out.println(obj2.toString()); // Late binding polymorphism
        System.out.println("---------------------------------------------------");
    }
    
}
