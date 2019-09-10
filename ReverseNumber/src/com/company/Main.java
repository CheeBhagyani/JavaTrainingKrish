package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String num = "352130";
//        String reverse = "";
//
//        for(int i = num.length() - 1; i >= 0; i--)
//        {
//            reverse = reverse + num.charAt(i);
//        }
//
//        System.out.println(reverse);

        int input, number, reversedNumber = 0;

        System.out.println("Enter the number to arrange in reverse order :455");
        input = new Scanner(System.in).nextInt();

        for(number = input; number != 0; number /= 10) {
            System.out.println(number);
            int digit = number % 10;
            System.out.println(digit + "\n");
            reversedNumber = reversedNumber * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}
