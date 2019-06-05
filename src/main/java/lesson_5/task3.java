/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

import java.util.HashMap;

/**
3. Create Map vehicles : vehicles.put("BMW", 5);, print
 */
public class task3 {
      public static void main(String[] args) {

    // Create a HashMap object called capitalCities
    HashMap<String, Integer> vehicles = new HashMap<String, Integer>();

    // Add keys and values (Country, City)
    vehicles.put("BMW", 5);
    System.out.println(vehicles); 
  }
}
