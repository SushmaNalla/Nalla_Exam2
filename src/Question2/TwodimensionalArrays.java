/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author Sushma Nalla
 */
public class TwodimensionalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter list1: ");
        for (int a = 0; a < m1.length; a++){
            for (int b = 0; b < m1[a].length; b++){
                m1[a][b] = scan.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int a = 0; a < m2.length; a++){
            for (int b = 0; b < m2[a].length; b++){
                m2[a][b] = scan.nextInt();
            }
        }

        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } 
        else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {

        if (m1[0].length != m2[0].length || m1.length != m2.length) {
            return false;
        }
        for (int a = 0; a < m1.length; a++) {
            for (int b = 0; b < m1[a].length; b++) {
                if (m1[a][b] != m2[a][b]) 
                    return false;
            }
        }
        return true;
    }
}



