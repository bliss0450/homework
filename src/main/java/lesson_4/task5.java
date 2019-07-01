/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_4;

import java.util.ArrayList;

/**
 * "5. Create ArrayList of Strings. Add 5 different Strings to it. Using any
 * cycle print all the values of the ArrayList to the console."
 */
public class task5 {

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("asda1");
        ar.add("asda2");
        ar.add("asda3");
        ar.add("asda4");
        ar.add("asda5");
        ar.add("asda6");
        
        for (String i : ar) {
            System.out.println(i);
        }
        
        System.out.println("Size: " + ar.size());
    }
}
