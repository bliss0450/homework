/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_6;

/**
 * "4. Fix the program to make it work: public static void main(String[] args) {
 * try { int a = 0; int b = 4 / a; } catch (Exception e) { e.printStackTrace();
 * } catch (ArithmeticException e) { e.printStackTrace(); } }"
 */
public class task4 {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
