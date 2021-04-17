/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8.Example2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sushma Nalla
 */
public abstract class AbstractTime extends Time {
    String Message = "HELLO";
    
   
  
    public void printMessage() {
        super.printMessage(Message); 
    }

    @Override
    public void printCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(new Date(System.currentTimeMillis())));
    }
    
    
}
