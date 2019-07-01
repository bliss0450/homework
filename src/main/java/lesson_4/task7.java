/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_4;
import java.util.HashMap;

/**
"7. Create HashMap<String, String> and add 10 pairs:
 watermelon, berry;
 banana, fruit;
 cherry, berry;
 pineapple, fruit;
 melon, vegetable;
 cranberry, berry;
 apple, fruit;
 iris, flower;
 potato, vegetable;
 carrot, vegetable;

Print the content of the map, each pair from a new line.
Example:  
watermelon - berry;
cherry - berry;
..."
 */
public class task7 {
    public static void main(String[] args) {
        
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("watermelon", "berry");
        hash.put("banana", "fruit");
        hash.put("cherry", "berry");
        hash.put("pineapple", "fruit");
        hash.put("melon", "berry");
        hash.put("cranberry", "berry");
        hash.put("apple", "fruit");
        hash.put("iris", "flower");
        hash.put("potato", "vegetable");
        hash.put("carrot", "vegetable");
        
        for(String i : hash.keySet()) {
            System.out.println(i + " - " + hash.get(i));
        }
        
        
        
        
        
    }
}
