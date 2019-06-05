/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

import java.util.HashMap;
import java.util.Map;

/**
 * "8. Create HashMap<String, String> and add 10 pairs: watermelon, berry;
 * banana, fruit; cherry, berry; pineapple, fruit; melon, vegetable; cranberry,
 * berry; apple, fruit; iris, flower; potato, vegetable; carrot, vegetable;
 * Print only vegetables to the console."
 */
public class task8 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("watermelon", "berry");
        map.put("banana", "fruit");
        map.put("cherry", "berry");
        map.put("pineapple", "fruit");
        map.put("melon", "vegetable");
        map.put("cranberry", "berry");
        map.put("apple", "fruit");
        map.put("iris", "flower");
        map.put("potato", "vegetable");
        map.put("carrot", "vegetable");
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            
            if ("vegetable".equals(entry.getValue())) {
                System.out.println(entry.getKey());
            }
        }
    }
}
