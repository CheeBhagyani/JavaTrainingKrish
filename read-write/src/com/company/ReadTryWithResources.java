package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTryWithResources {
    public static void main(String[] args) {
        String filePath = "/home/user/Desktop/read-write/src/com/company/files/readFile";
        File readFile = new File(filePath);

        try {
            FileReader fileReader = new FileReader(readFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String text = "";

            while((text = bufferedReader.readLine())!=null) {
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
