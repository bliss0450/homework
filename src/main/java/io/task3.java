package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//                "3. Написать программу для копирования всех файлов из одного каталога в
//                        другой."
public class task3 {
    public static void main(String[] args) throws IOException
    {
        Path temp = Files.move
                (Paths.get("C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources\\From\\1.txt"),
                        Paths.get("C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources\\To\\1.txt"));

        if(temp != null)
        {
            System.out.println("File renamed and moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
    }
}
