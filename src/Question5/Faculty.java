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
public class Faculty extends Employee{
    private double officeHours;
    private int noOfTeachingSubjects;

    public Faculty(double hours, int noOfTeachingSubjects, String office, double salary, String dataHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dataHired, name, address, phoneNumber, emailAddress);
        this.officeHours = hours;
        this.noOfTeachingSubjects = noOfTeachingSubjects;
    }
    
    @Override
    public String toString() {
        return " Class Name: " + this.getClass().getSimpleName()+", "+"Name: " + getName();
    }
    
}
