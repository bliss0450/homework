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
public class minInt {
    public static void main(String[] args) {
        System.out.println(min(123,34,35,342));
    }
    
    static int min(int a, int b, int c, int d) {
        int min1 = min(a, b);
        int min2 = min(c, d);
        int min;
        
        if (min1 < min2) {
            min = min1;
        } else {
            min = min2;
        }
        return min;
    }
    
    static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
