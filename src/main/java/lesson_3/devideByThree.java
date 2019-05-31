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
public class devideByThree {

    public static void main(String[] args) {
        int i = 1;
        do {
           if (i % 3 == 0) {
               System.out.println(i);
           }
           i++;
        } while (i <= 100);
    }
}
