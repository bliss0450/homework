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
public class Encapsulation {
        public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

//        public void setName(String name) {
//            this.name = name;
//        }

        public int getAge() {
            return age;
        }

//        public void setAge(int age) {
//            this.age = age;
//        }
    }
}
