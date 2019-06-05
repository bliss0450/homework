/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * "9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
 * Create HashSet<Integer> and add all unique numbers from the ArrayList."
 */
public class task9 {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            ar.add(rand.nextInt(99));
        }
        
        System.out.println(ar.size());

        HashSet<Integer> hashSet = new HashSet(ar);

        System.out.println(hashSet.size());
    }

}
