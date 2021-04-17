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
public class JavaTeacher extends Teacher {
    private String subject;

    public JavaTeacher(String subject, String name, String designation) {
        super(name, designation);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        System.out.println("This is a Child");
        return "subject=" + subject;
    }
    
    
}
