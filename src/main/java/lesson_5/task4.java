/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

import java.util.Arrays;
import java.util.Random;

/**
Create an array of 15 random integers from the segment [0;   9]. Display the array on the screen. Count how many in the array of even elements and display this number on the screen on a separate line.
 */
public class task4 {

    public static void main(String[] args) {
        int[] ar = new int[15];
        int even = 0;

        Random rand = new Random();

        for (int i = 0; i < ar.length; i++) {
            ar[i] = rand.nextInt(9);
            if (ar[i] % 2 == 0) {
                even++;
            }
        }

        System.out.println("Array - " + Arrays.toString(ar));
        System.out.println("Even numbers : " + even);

    }
}
