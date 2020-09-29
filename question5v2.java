package com.strathjava;

import java.util.Scanner;

public class question5v2 {

    public static void main(String[] args) {
        Boolean repeat = true;

        while(true){
            while (true) {

                int givenNumber = 0;
                // Get user input
                // Check if the input given is a number or not

                while (true){
                    System.out.print("Enter a number: ");
                    Scanner scanner = new Scanner(System.in);
                    String number = scanner.nextLine();
                    if (number.matches("\\d+")){
                        int inputNumber = Integer.valueOf(number).intValue();
                        givenNumber = inputNumber;
                        break;
                    }
                    else {
                        continue;
                    }
                }

                // Check if number given is even or not

                if (givenNumber % 2 == 0) {
                    System.out.println("Lucky Guess");
                }
                else {
                    System.out.println("Better Luck Next Time");
                }
                break;

            }

            //Limiting user's reply to either y or n

            while (true) {

                System.out.println("Try again ? ");
                Scanner response = new Scanner(System.in);
                String reply = response.nextLine();
                if (reply.matches("y")) {

                    break;
                }
                else if (reply.matches("n")) {

                    repeat = false;
                    break;
                }
                else {
                    System.out.println("Reply with either y for yes or n for no");
                    continue;
                }
            }

            // Continuing / Not continuing depending on user input
            if (repeat){
                continue;
            }
            else {
                break;
            }

        }
    }
}
