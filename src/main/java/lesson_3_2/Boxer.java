/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_3_2;

/**
 *
 * @author a.lemeshchuk
 */
public class Boxer {
    int age;
    int weight;
    int strength;
    
    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    
    public boolean fight(Boxer boxer2) {
        if (this.age > boxer2.age
                && this.strength > boxer2.strength
                && this.weight > boxer2.weight) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
    
    public static void main(String[] args) {
        Boxer boxer1 = new Boxer(10,10,10);
        Boxer boxer2 = new Boxer(20,20,20);
        
        boxer2.fight(boxer1);
    }
}
