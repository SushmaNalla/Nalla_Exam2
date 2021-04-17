/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Sushma Nalla
 */
public class Circle {
    private double radius = 2;

    public Circle() {
        
    }
    
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return  "radius= " + radius +", "+"Area of Circle= " + getArea();
    }
    
    
}
