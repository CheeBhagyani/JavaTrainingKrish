package com.company;

public class TestPrinter {
    void testPrinter() {
        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("Regular Way");
            }
        };
        printer.print();
    }
}
