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
public class Employee extends Person{
    private String office;
    private double salary;
    private String dataHired;

    public Employee(String office, double salary, String dataHired, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dataHired = dataHired;
    }

    @Override
    public String toString() {
         return " Class Name: " + this.getClass().getSimpleName()+", "+"Name: " + getName();
    
    }
    
    
    
}
