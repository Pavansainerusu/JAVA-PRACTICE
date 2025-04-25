package com.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {
        String path = "C:\\Users\\pavan\\Desktop\\sample.txt"; 

        try {
            Scanner s = new Scanner(new File(path));
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
            s.close();
            System.out.println("try block completed");
        } catch (FileNotFoundException e) {
            System.out.println("catch block: " + e);
        }
    }
}
