/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Sushma Nalla
 */
public class AddObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> obj = new ArrayList<Object>();
        obj.add(new Loan());
        obj.add(new Date());
        obj.add(new String("Inserting Object"));
        obj.add(new Circle());
        
       for(Object i : obj){
           System.out.println(i.toString());
           
       }
        
    }
  
    
}
