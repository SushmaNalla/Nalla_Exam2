/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author Sushma Nalla
 */
public class Teacher {
    String name;
    String designation;

    public Teacher(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public String profession(){
        return "Teaching";
    }

    @Override
    public String toString() {
        System.out.println("This is a parent");
        return "name=" + name + ", designation=" + designation ;
    }
    
        
}
