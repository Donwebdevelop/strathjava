package com.strathjava;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number%2==0){
            System.out.println("Lucky Guess");
        }
        else {
            System.out.println("Better Luck Next Time");
        }
    }
}
