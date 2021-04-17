/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.Example2;

/**
 *
 * @author Sushma Nalla
 */
public class Ios extends Android {
    private double operatingSystem;

    public Ios(double operatingSystem, String modelName, double screenSize) {
        super(modelName, screenSize);
        this.operatingSystem = operatingSystem;
    }

    public double getOperatingSystem() {
        return operatingSystem;
    }
    
    


   
    
    @Override
    public String toString() {
        return super.toString()+ ", Operating System =" +getOperatingSystem();
    }
    

}
