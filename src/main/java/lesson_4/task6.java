/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * "6. Create ArrayList of Strings. Add 10 different Strings to it. Using any
 * cycle find the longest String in the list and print it out. If there are
 * several String with the same legth - print each from a new line."
 */
public class task6 {

    public static String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            ar.add(randomAlphaNumeric(rand.nextInt(15)));
        }

        System.out.println();
        System.out.println("and now the largest strings:");
        for (String var : ar) {
//            if (var.length() == Collections.max(ar, Comparator.comparing(s -> s.length())).length()) {
//                System.out.println(var);
//            }
        }
    }
}
