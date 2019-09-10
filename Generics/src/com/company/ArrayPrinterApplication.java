package com.company;

public class ArrayPrinterApplication {

    public static void main(String[] args) {
        ArrayPrinter arrayPrinter = new ArrayPrinter();
        String arrSt[] = {"a","b","c"};
        Integer arrInt[] = {1,2,3};

        arrayPrinter.printArray(arrInt);
        arrayPrinter.printArray(arrSt);


    }
}
