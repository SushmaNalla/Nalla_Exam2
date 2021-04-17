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
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Person person = new Person("Sushma", "1215 west street",
            "8967432", "sushma@gmail.com");

    Student student = new Student("GRADUATE","Sukeerthi", "16 street", "8166528",
            "sukeerthi@gmail.com");

    Employee employee = new Employee("techm",5000,"12-21-2020","Hema",
            "horizon street", "8965788","hema.com");

    Faculty faculty = new Faculty(2,5,"accenture",6000,"10-11-2019","Devi",
            "10 street", "895743","devi@gmail.com");

    Staff staff = new Staff("Software Engineer","techm",5000,"12-21-2020",
            "Swathi", "horizon street", "895834788","Swathi.com");

    System.out.println(person.toString());
    System.out.println(student.toString());
    System.out.println(employee.toString());
    System.out.println(faculty.toString());
    System.out.println(staff.toString());
	
    }
    
}
