package com.company;

import java.io.*;

public class Read {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/user/Desktop/bhagyani/JavaTrainingVirtusa/read-write/src/com/company/files/textFile";
        File file = new File(filePath);

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";

        while((line=bufferedReader.readLine())!=null) {
            System.out.println(line);
        }

        fileReader.close();
        bufferedReader.close();
    }
}
