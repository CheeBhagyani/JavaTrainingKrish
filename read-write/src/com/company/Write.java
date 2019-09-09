package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/user/Desktop/read-write/src/com/company/files/writeFile";

        FileWriter writer = new FileWriter(filePath);
        BufferedWriter buffer = new BufferedWriter(writer);

        buffer.write("Write to file");

        buffer.close();
    }
}
