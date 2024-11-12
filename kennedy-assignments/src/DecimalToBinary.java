package com.keyin;

import java.util.Scanner;

public class DecimalToBinary {


    public static String convertToBinary(int num) {

        if (num == 0) {
            return "";
        }

        return convertToBinary(num / 2) + (num % 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();


        String binary = convertToBinary(number);
        System.out.println("The binary representation is: " + (binary.isEmpty() ? "0" : binary));
    }
}
