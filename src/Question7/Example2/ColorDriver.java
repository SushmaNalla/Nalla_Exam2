/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7.Example2;

/**
 *
 * @author Sushma Nalla
 */
public class ColorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Color value = Color.RED;
        
        switch(value){
            case GREEN:
                System.out.println("Green GO");
                break;
            case RED:
                System.out.println("Red STOP");
                break;
            case YELLOW:
                System.out.println("Yellow READY");
                break;
              
        }
        System.out.println(Color.valueOf("YELLOW"));
    }
    
}
