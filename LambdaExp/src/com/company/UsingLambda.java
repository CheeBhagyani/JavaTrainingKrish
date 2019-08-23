package com.company;

public class UsingLambda {
    void testPrinter() {
        Printer printer = ()-> System.out.println("Using lambda");
        printer.print();
    }
}
