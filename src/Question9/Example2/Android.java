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
public abstract class Android implements MobilePhone {
    public String modelName;
    public double screenSize;

    public Android(String modelName, double screenSize) {
        this.modelName = modelName;
        this.screenSize = screenSize;
    }

    public String getModelName() {
        return modelName;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public double priceAfterDiscount(){
        return price-(price*discount)/100;
    }
    

    @Override
    public String toString() {
        return  "modelName=" + modelName + ", screenSize=" + screenSize;
    }
    
    
}
