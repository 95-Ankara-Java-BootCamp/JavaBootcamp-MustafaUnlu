package com.company;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int variable = 0;
        int variable_2 = 1;
        int total;

        System.out.print("Fibonacci");
        for(int i=0; i<10; i++){
            total = variable + variable_2;
            System.out.print(total+" ");
            variable = variable_2;
            variable_2 = total;
        }
    }
}
