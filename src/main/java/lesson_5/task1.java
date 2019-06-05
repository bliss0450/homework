/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. Create ArrayList and print it.
 */
public class task1 {

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("one");
        ar.add("two");
        System.out.println(Arrays.toString(ar.toArray()));
    }
}
