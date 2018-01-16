package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        // write your code here

        Scanner robo = new Scanner(System.in);

        int value1 = robo.nextLine();
        int value2 = robo.nextLine();
        int addition = addNumbers(value1, value2);
        int subtraction = subNumbers(value1, value2);
        int multiplication = multNumbers(value1, value2);
        int division = divNumbers(value1, value2);}

        public static int addNumbers(int number1, int number2){
        int newValueAdd = number1 + number2;
        return newValueAdd;}

        public static int subNumbers(int number1, int number2){
        int newValueSubtract = number1 - number2;
        return newValueSubtract;}
        public static int multNumbers(int number1, int number2){
        int newValueMultiply = number1 + number2;
        return newValueMultiply;}

        public static int divNumbers(int number1, int number2){
        int newValueDivide = number1 - number2;
        return newValueDivide;}




        Boolean ask = true;

        while (ask) {
            System.out.println("Would you like to use the calculator?");
            String userAnswer = robo.nextLine();
            if (userAnswer.equalsIgnoreCase("yes")) {

                System.out.println("welcome to the calcualtor. Please enter a number.");

                String userinput = robo.nextLine();
                System.out.println("Please choose +, -, *, or /");
                String userinput2 = robo.nextLine();
                System.out.println("Please enter the next number for your calculation");
                String userinput3 = robo.nextLine();

//                int firstN = Integer.parseInt(userinput);
//                int thirdN = Integer.parseInt(userinput3);
//                int finalResult = 0;


//                if (userinput2.equals("+")) {
//                    finalResult = firstN + thirdN;
//                } else if (userinput2.equals("-")) {
//                    finalResult = firstN - thirdN;
//                } else if (userinput2.equals("*")) {
//                    finalResult = firstN * thirdN;
//                } else if (userinput2.equals("/")) {
//                    finalResult = firstN / thirdN;
//                }


                System.out.println("Here is your final number: " + finalResult);


            } else{
                ask = false;
                System.out.println("Goodbye");

            }}
    }
