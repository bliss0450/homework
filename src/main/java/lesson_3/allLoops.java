/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_3;

/**
 *
 * @author a.lemeshchuk
 */
public class allLoops {
    
    public static void main(String[] args) {
        whileCycle();
        forCycle();
        doWhileCycle();
        forEach();
    }
    
    static void whileCycle() {
        int i = 10;
        System.out.println();
        System.out.println("While");
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }
    
    static void forCycle() {
        System.out.println();
        System.out.println("For");     
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
    }
    
    static void doWhileCycle() {
        int i = 10;
        System.out.println();
        System.out.println("Do While");           
        do {
            System.out.println(i);
            i++;
        } while (i<=20);
    }

    static void forEach() {
        int[] ar = {10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("For Each");
        for (int num : ar) {
            System.out.println(num);
        }
    }
}
