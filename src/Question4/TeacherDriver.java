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
public class TeacherDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher obj1 = new Teacher("Swathi","AssistantTeacher");
        JavaTeacher obj2 = new JavaTeacher("Java","Ajay Bandi","Teacher");
        System.out.println("----------------------------");
        System.out.println(obj1);
        System.out.println("----------------------------");
        System.out.println(obj2);
        System.out.println("----------------------------");
        System.out.println("This is an example for Inheritance");
        System.out.println("Profession "+obj2.profession());// This is due to inheritance
        System.out.println("----------------------------");
        Teacher obj3 = new JavaTeacher("Java","Vamshi","Teacher");// Polymorphic substitution
        System.out.println("This is an example for Late binding polymorphism");
        System.out.println(obj3.getName()+ " is a "+ obj3.getDesignation());// Late binding polymorphism
        System.out.println("----------------------------");
    }
    
}
