package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

//
//"4. Написать программу, которая создаст текстовый файл и запишет в него
//        список файлов (путь, имя, дата создания) из заданного каталога."
public class task4 {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources");
        File[] directoryListing = dir.listFiles();
        PrintWriter writer = new PrintWriter("C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources\\created_file.txt", "UTF-8");
        if (directoryListing != null) {
            for (File child : directoryListing) {
                String path = child.getAbsolutePath();
                BasicFileAttributes attr = Files.readAttributes(Paths.get(path), BasicFileAttributes.class);

                writer.println(child.getAbsolutePath());
                writer.println(child.getName() + " ");
                writer.println(attr.creationTime());
                writer.println(" ");
            }
        }
        writer.close();
    }
}
