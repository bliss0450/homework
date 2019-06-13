/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * "6. Write a program that will enter numbers from the keyboard. The code for
 * reading numbers from the keyboard must be in the readData method. The code
 * inside the readData is wrapped in a try..catch. If the user entered some
 * text, instead of entering a number, the method should catch the exception and
 * display all previously entered numbers as a result. Numbers output from a new
 * line preserving the order of input."
 */
public class task6 {

    public static void main(String[] args) {
        readData();
    }

    private static void readData() {
        Scanner scan = new Scanner(System.in);
        ArrayList ar = new ArrayList<Integer>();

        for (;;) {
            try {
                ar.add(scan.nextInt());
            } catch (Exception e) {
                System.out.println("Got it!");
                break;
            }
        }

        System.out.println(ar.toString());
    }

}
