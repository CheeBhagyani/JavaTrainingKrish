package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/user/Desktop/bhagyani/JavaTrainingVirtusa/read-write/src/com/company/files/textFile";

        FileWriter writer = new FileWriter(filePath);
        BufferedWriter buffer = new BufferedWriter(writer);

        for (int i = 1; i < 11; i++){
            buffer.write("" + i + "\n");
        }

        buffer.close();
    }
}
