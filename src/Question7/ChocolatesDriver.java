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
public class ChocolatesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Chocolates.DAIRYMILK.getPrice());
        for(Chocolates choco:Chocolates.values()){
            System.out.println(choco+" Chocolate price is: " +choco.getPrice());
            
        }
        System.out.println(Chocolates.valueOf("MILKYBAR"));
    }
    
}
