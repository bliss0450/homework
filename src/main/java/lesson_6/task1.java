/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_6;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * 1. Создать аннотацию, которая принимает параметры для метода. Написать код,
 * который вызовет метод, помеченный этой аннотацией, и передаст параметры
 * аннотации в вызываемый метод.
 */
public class task1 {

    @Inherited
    @Target(value = ElementType.METHOD)
    @Retention(value = RetentionPolicy.RUNTIME)
    public @interface MyAnnotation {
        int a() default 0;
        int b() default 0;
    }

    @MyAnnotation()
    public static void test(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class <?> cls = task1.class;
        Method m = cls.getMethod("test", int.class, int.class);

        try {
            if (m.isAnnotationPresent(MyAnnotation.class)) {
                System.out.println("YES");
            }
        } catch (SecurityException e) {
            System.out.println("NO");
        }
    }
}
