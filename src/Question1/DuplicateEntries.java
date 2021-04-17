/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sushma Nalla
 */
public class DuplicateEntries {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for(int i=0; i<10; i++){
            int values = scan.nextInt();
            list.add(values);
        }
        removeDuplicate(list);
        
        
    }

    /**
     * This method will remove the duplicates from the list
     * @param list
     */
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> intList = new ArrayList<>();
        for(Integer i : list){
            if(!intList.contains(i)){
                intList.add(i);
                
            }
        }
        System.out.print("The distinct integers are ");
        for(int j : intList){
           System.out.print(j+" ");
        }
            
    }
        
}
