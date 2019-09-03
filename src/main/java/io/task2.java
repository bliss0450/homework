package io;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

//2. Написать программу, которая скопирует несколько файлов в один.
public class task2 {

    public static void main(String[] args) throws IOException {
        {
            // PrintWriter object for file3.txt
            PrintWriter pw = new PrintWriter("C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources\\CopyIntoTheFile.txt");

            // BufferedReader object for file1.txt
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources\\CopyFromFile1.txt"));

            String line = br.readLine();

            // loop to copy each line of
            // file1.txt to  file3.txt
            while (line != null)
            {
                pw.println(line);
                line = br.readLine();
            }

            br = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources\\CopyFromFile2.txt"));

            line = br.readLine();

            // loop to copy each line of
            // file2.txt to  file3.txt
            while(line != null)
            {
                pw.println(line);
                line = br.readLine();
            }

            pw.flush();

            // closing resources
            br.close();
            pw.close();

            System.out.println("Merged file1.txt and file2.txt into file3.txt");
        }
    }
}
