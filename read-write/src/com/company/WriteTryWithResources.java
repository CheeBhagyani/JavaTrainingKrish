package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTryWithResources {
    public static void main(String[] args) {
        String writeFile = "/home/user/Desktop/bhagyani/JavaTrainingVirtusa/read-write/src/com/company/files/textFile";

        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(writeFile))) {
            for (int i = 1; i < 11; i++){
                buffer.write("" + i + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
