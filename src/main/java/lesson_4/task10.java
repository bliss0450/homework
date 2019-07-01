/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_4;

/**
 * "10. Create enum for days of the week. Write a program which will be printing
 * the number of a day according to day of the week. Example: If today is Sunday
 * - print 1; If today is Monday - print 2 ..."
 */
public class task10 {

    public static void main(String[] args) {
        enumTask10 day = enumTask10.THURSDAY;

        switch (day) {
            case SUNDAY:
                System.out.println(1);
                break;
            case MONDAY:
                System.out.println(2);
                break;
            case TUESDAY:
                System.out.println(3);
                break;
            case WEDNESDAY:
                System.out.println(4);
                break;
            case THURSDAY:
                System.out.println(5);
                break;
            case FRIDAY:
                System.out.println(6);
                break;
            case SATURDAY:
                System.out.println(7);
                break;
            default:
                System.out.println("Incorect day!");
              
        }

    }
}
