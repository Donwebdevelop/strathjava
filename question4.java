package com.strathjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class question4 {
    public static void main(String[] args) {
        int number= 0;
        List<Integer> numbers  = new ArrayList<Integer>();
        for (int i=1;i<=100;i++){
            if (i%2!=0){
                numbers.add(i);
            }


        }
        System.out.println(numbers);
    }
}
