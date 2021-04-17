/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Sushma Nalla
 */
public class Student extends Person {

    
    private String grade;
    private String status = "Graduate";

    public Student(String grade, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }
    
    
    @Override
    public String toString() {
        return " Class Name: " + this.getClass().getSimpleName()+", "+"Name: " + getName();
    }
    
}
