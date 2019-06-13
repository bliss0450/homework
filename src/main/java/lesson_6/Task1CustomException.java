/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_6;

/**
 * 1. Create method to check: if number < 0 print “Number < 0”, if number > 0
 * print “Number > 0” if number = 0 throw your own exception
 */
class Task1CustomException extends Exception {

    public Task1CustomException(String message) {
        super(message);
    }

}
