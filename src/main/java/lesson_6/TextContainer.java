/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_6;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * "2. Написать класс TextContainer, который содержит в себе строку. С помощью
 * механизма аннотаций указать 1) в какой файл должен сохраниться текст 2)
 * метод, который выполнит сохранение. Написать класс Saver, который сохранит
 * поле класса TextContainer в указанный файл."
 */
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@interface SaveTo {
    String path();
}

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Saver {
}

@SaveTo(path = "D:\\file2.txt")
public class TextContainer {
    static String s = "string";

    @Saver
    public static void save(String path) throws IOException {
        FileWriter w = new FileWriter(path);
        try {
            w.write(s);
        } finally {
            w.close();
        }
    }

}
