package com.company;

import java.io.FileOutputStream;

public class Main2 {

    public static void main(String[] args) {
        readFile("test2.txt");
    }

    private static void readFile(String fileName) {
        try{
            FileOutputStream fout = new FileOutputStream(fileName);
            String s = "test test test";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
        }
        catch(Exception e){ e.printStackTrace(); }
    }
}
