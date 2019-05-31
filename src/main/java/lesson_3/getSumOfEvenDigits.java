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
public class getSumOfEvenDigits {
    
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1212121212));
    }

    static int getEvenDigitSum(int a) {

        if (a < 0) {
            return -1;
        } else {
            String b = Integer.toString(a);
            int sum = 0;

            for (int i = 0; i < b.length(); i++) {
                int c = Integer.parseInt(String.valueOf(b.charAt(i)));
                if (c % 2 == 0) {
                    sum = sum + c;
                }
            }

            return sum;
        }
    }
}
