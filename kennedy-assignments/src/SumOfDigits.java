package com.keyin;

import java.util.Scanner;

public class SumOfDigits {


    public static int sumOfDigits(int num) {

        if (num == 0) {
            return 0;
        }

        return num % 10 + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();


        int result = sumOfDigits(number);
        System.out.println("The sum of digits is: " + result);
    }
}
