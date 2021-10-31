package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("What are your numbers: ");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            System.out.println("What do you want to do (+,-,*,/,^(power):");
            char operator = input.next().charAt(0);
            if (operator == '+') {
                System.out.println(Functions.add(num1, num2));
            } else if (operator == '-') {
                System.out.println(Functions.minus(num1, num2));
            } else if (operator == '*') {
                System.out.println(Functions.multiply(num1, num2));
            } else if (operator == '/') {
                System.out.println(Functions.divide(num1, num2));
            } else if (operator == '^') {
                System.out.println(Functions.power(num1, num2));
            } else {
                System.out.println(operator + " not recognised.");
            }
        }

    }
}
