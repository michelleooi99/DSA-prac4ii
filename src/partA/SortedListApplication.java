/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partA;

import java.util.Random;

/**
 *
 * @author Tarc
 */
public class SortedListApplication {
    
    public static void main(String[] args) {
        SortedList<Integer> list = new SortedArrayList();
        Random randomNumber = new Random();
        int rdm = 0;
        
        System.out.print("Input : ");
        
        for(int i = 0; i < 10; i++){
            rdm = randomNumber.nextInt(10);
            System.out.print(rdm + " ");
            list.add(rdm);
        }
        
        System.out.println("\n\nList : " + list.toString());
        
        boolean success = list.remove(rdm);
        
        if(success){
            System.out.println("\nRemove " + rdm + " : " + list);
        }
        else {
            System.out.println("Nothing to remove !");
        }
    }
}
