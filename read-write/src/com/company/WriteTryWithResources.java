package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTryWithResources {
    public static void main(String[] args) {
        String writeFile = "/home/user/Desktop/read-write/src/com/company/files/writeFile";

        try {
            FileWriter writer = new FileWriter(writeFile);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("Writing to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
