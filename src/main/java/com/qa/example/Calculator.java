
package com.qa.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public int addition(int a, int b){
        return a + b;
    }
    public int multiplication(int a, int b){
        return a * b;
    }
    public int subtraction(int a, int b){
        return a - b;
    }
    public int division(int a, int b){
        return a / b;
    }

//    public static void main(String[] args)
//    {
//        double n1, n2;
//        String operation;
//        Scanner scanner = new Scanner(System.in);
//
//        try
//        {
//        System.out.println("Enter first number");
//        n1 = scanner.nextDouble();
//
//        System.out.println("Enter second number");
//        n2 = scanner.nextDouble();
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter operator (*, / , - or +)");
//        operation = scan.next();
//
//            if ("+".equals(operation)) {
//                System.out.println("Your answer is " + (n1 + n2));
//
//            }
//            else if ("-".equals(operation))
//            {
//                System.out.println("Your answer is " + (n1 - n2));
//
//            }
//            else if ("/".equals(operation))
//            {
//                System.out.println("Your answer is " + (n1 / n2));
//
//            }
//            else if ("*".equals(operation))
//            {
//                System.out.println("Your answer is " + (n1 * n2));
//
//            }
//            else {
//                System.out.println("Incorrect data entered");
//            }
//
//    }
//    catch(InputMismatchException e)
//        {
//            System.out.println("Incorrect data entered");
//        }
//    }
//

}