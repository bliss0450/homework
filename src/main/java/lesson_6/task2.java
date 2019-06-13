/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_6;

/**
 * "2. Fix the method with try-catch to get the correct result of division:
 * public class Main {
 *
 * public static void main(String[] args) { System.out.println(divideByZero());
 * }
 *
 * public static int divideByZero() { int a = 5; int b = 0; return a / b; } }"
 */
public class task2 {

    public static void main(String[] args) {
        try {
        System.out.println(divideByZero());
        } catch(Exception e) {
            System.out.println("You are trying to devide by zero");
        }
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        return a / b;
    }
}
