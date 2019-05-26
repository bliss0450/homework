package lesson_1;

//    "8*. Write a program which prints ""Hello world"" to the console using methods transformIntToChar and printList only.

import java.util.ArrayList;

public class hEight {


        public static void main(String[] args) {
            // write your code here
            int[] ar = new int[] {72, 101, 108, 108, 111, 32, 119, 111, 114,108,100};

            printList(transformIntToChar(ar));

        }

        private static ArrayList<Character> transformIntToChar(int... values) {
            ArrayList<Character> buffer = new ArrayList<>();
            for (int i: values) {
                buffer.add(((char) i));
            }
            return buffer;
        }

        private static void printList(ArrayList<Character> characters) {
            for (char c: characters) {
                System.out.print(c);
            }
        }

}
