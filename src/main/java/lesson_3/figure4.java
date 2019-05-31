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
public class figure4 {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                if (j==6) {
                    System.out.print("*");
                } else if ((j == 5 || j == 7) && i >= 1) {
                    System.out.print("*");
                } else if ((j == 4 || j == 8) && i >= 2) {
                    System.out.print("*");
                } else if ((j == 3 || j == 9) && i >= 3) { 
                    System.out.print("*");
                } else if ((j == 2 || j == 10) && i >= 4) { 
                    System.out.print("*");
                } else if ((j == 1 || j == 11) && i >= 5) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
