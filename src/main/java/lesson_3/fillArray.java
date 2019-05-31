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
public class fillArray {

    public static void main(String[] args) {
        int ar[] = new int[100];
        for (int i = ar.length, j = 0; j < ar.length; i--, j++) {
            ar[j] = i;
            System.out.println(ar[j]);
        }
    }
}
