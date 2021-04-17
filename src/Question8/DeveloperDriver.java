/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Sushma Nalla
 */
public class DeveloperDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaDeveloper execute = new JavaDeveloper();
        SoftwareDeveloper execute1 = new SoftwareDeveloper();
        
        System.out.println("-----------------------------");
        System.out.println("Regular Method");
        execute.write();
        System.out.println("-----------------------------");
        System.out.println("Abstract Method");
        execute.run();
        execute1.run();
        System.out.println("-----------------------------");
    }
}
	
    
    

