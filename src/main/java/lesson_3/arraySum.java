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
public class arraySum {
    
    public static void main(String[] args) {
        int ar[] = {1, 10, 10, 10, 10, 10, 10, 10, 10, 1};
        int sum = 0;
        for (int i = 1; i < ar.length-1; i ++) {
            sum = sum + ar[i]; 
        }
        System.out.println(sum);       
    }
}
