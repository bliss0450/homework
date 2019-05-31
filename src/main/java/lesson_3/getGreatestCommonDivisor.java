/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author a.lemeshchuk
 */
public class getGreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(45, 165));
    }

    static int getGreatestCommonDivisor(int a, int b) {

        int leftover;
        int c;

        do {
            if (a < b) {
                leftover = b % a;
                b = a;
                c = a;
                a = leftover;
            } else {
                leftover = a % b;
                a = b;
                c = b;
                b = leftover;
            }

        } while (leftover > 0);

        return c;
    }
}
