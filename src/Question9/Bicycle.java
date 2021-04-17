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
public interface Bicycle {
   public static final double GST = 9.5;
    public static final int discount = 10;
    public static final double price = 200;
    
    public abstract double calcPrice();
    public abstract double calcPriceAfterDisc(); 
}
