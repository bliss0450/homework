/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

/**
 * 1. Create method to check: if number < 0 print “Number < 0”, if number > 0
 * print “Number > 0” if number = 0 throw your own exception
 */
public class task1 {

    public void getException(int i) throws Task1CustomException {

        if (i < 0) {
            System.out.println("i < 0");
        } else if (i > 0) {
            System.out.println("i > 0");
        } else {
            throw new Task1CustomException("i == 0");
        }
    }

}
