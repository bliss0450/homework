/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

/**
 * "3. Finish the program to handle all the possible exceptions: public class
 * Main {
 *
 * public static void main(String[] args) { int a = args.length;
 * System.out.println(a);
 *
 * int b = 10 / a; int[] c = {1}; System.out.println(c[1]);
 *
 * }
 *
 * }
 *
 * Print the cause of the exception to the console."
 */
public class task3 {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        try {
        int b = 10 / a;
        } catch(Exception e) {
            System.out.println(e);
        }
        int[] c = {1};
        
        try {
        System.out.println(c[1]);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
