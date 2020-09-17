package com.strathjava;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {

        double[] numbers = new double[3];

        for (int i=0;i<3;i++){
            System.out.print("Enter number" + (i+1) + ": ");
            Scanner scanner = new Scanner(System.in);
            double number = scanner.nextInt();
            numbers[i] = number;

        }


        double sum, product, average;
        sum = average = 0;;
        product = 1;


        for (int i=0; i<3;i++){
            sum+= numbers[i];
            product *= numbers[i];

        }

        average= sum/3;
        String[] answerNames = {"Sum: ", "Product: ", "Average: "};
        double[] answers = {sum, product, average};

        for (int i=0; i<3;i++){
            System.out.println(answerNames[i] + answers[i]);

        }


    }
}
