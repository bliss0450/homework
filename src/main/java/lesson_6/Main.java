/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * "2. Написать класс TextContainer, который содержит в себе строку. С помощью
 * механизма аннотаций указать 1) в какой файл должен сохраниться текст 2)
 * метод, который выполнит сохранение. Написать класс Saver, который сохранит
 * поле класса TextContainer в указанный файл."
 */
public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = TextContainer.class;
        Method method = cls.getMethod("save", String.class);

        if (cls.isAnnotationPresent(SaveTo.class) && method.isAnnotationPresent(Saver.class)) {
            SaveTo saveTo = cls.getAnnotation(SaveTo.class);
            method.invoke(cls, saveTo.path());
        }
    }
}
