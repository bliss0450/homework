package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//1. Написать программу, которая считает текстовый файл, заменит в нем все слова “Hello” на “1234” и запишет изменения в тот-же файл.
public class task1 {
    List<String> lines = new ArrayList<String>();
    String line = null;

    public void helloToNumbers() {
        try {
            File f1 = new File("C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources\\HelloTo1234.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                if (line.contains("Hello"))
                    line = line.replace("Hello", "1234");
                lines.add(line);
            }
            fr.close();
            br.close();

            FileWriter fw = new FileWriter(f1);
            BufferedWriter out = new BufferedWriter(fw);
            for(String s : lines)
                out.write(s);
            out.flush();
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {
        task1 fr = new task1();
        fr.helloToNumbers();
    }
    }
