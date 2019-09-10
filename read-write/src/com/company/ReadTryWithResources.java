package com.company;

import java.io.*;

public class ReadTryWithResources {
    public static void main(String[] args) {
        String filePath = "/home/user/Desktop/bhagyani/JavaTrainingVirtusa/read-write/src/com/company/files/textFile";
        File readFile = new File(filePath);

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(readFile))) {

            String text = "";

            while(( text = bufferedReader.readLine())!=null) {
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
