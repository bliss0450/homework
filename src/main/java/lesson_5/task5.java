/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

/**
 * "5. Throw a NullPointerException from the method iCanThrowException(); Handle
 * it in the main method. public class Main {
 *
 * public static void main(String[] args) { iCanThrowException(); }
 *
 * public static void iCanThrowException() {
 *
 * }
 *
 * }"
 */
public class task5 {

    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException e) {
            System.out.println("Got it!");
        }
    }

    public static void iCanThrowException() {
        throw new NullPointerException();
    }
}
