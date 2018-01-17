package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        boolean ask = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Java Calculator");

        while (ask) {

//            String[] questions = {
//
//                    "Please enter the first number: ",
//                    "Please enter the operator you want to use(+, -, *, /): ",
//                    "Please enter the second number: ",
//            };
//
//            List<String> answers = new ArrayList<>();
//
//            for (int i = 0; i < questions.length; i++) {
//                System.out.println(questions[i]);
//                String userEntry = sc.nextLine();
//                answers.add(userEntry);


//            String firstNum = answers.get(0);
//            int fstNumber = Integer.parseInt(firstNum);
//
//            String secondNum = answers.get(2);
//            int scndNumber = Integer.parseInt(secondNum);
//
//            String operator = answers.get(1);
            System.out.println("Please enter the first number: ");
            String firstNumber = sc.nextLine();
            System.out.println("Please enter the operator you want to use(+, -, *, /): ");
            String operator = sc.nextLine();
            System.out.println("Please enter the second number: ");
            String secondNumber = sc.nextLine();

            double fstNumber =
                    Double.parseDouble(firstNumber);
            double scndNumber =
                    Double.parseDouble(secondNumber);
            double intResult = 0.0;

            if (operator.equals("+") || operator.equals("add")) {
                intResult = add(fstNumber, scndNumber);
            } else if (operator.equals("-") || operator.equals("subtract")) {
                intResult = subtract(fstNumber, scndNumber);
            } else if (operator.equals("*") || operator.equals("multiply")) {
                intResult = multiply(fstNumber, scndNumber);
            } else if (operator.equals("/") || operator.equals("divide")) {
                intResult = divide(fstNumber, scndNumber);
            }
            System.out.println("Your number is: " + intResult);

            System.out.println("Would you like to use the calculator?");
            String userAnswer = sc.nextLine();
            if (userAnswer.equalsIgnoreCase("Yes")|| userAnswer.equalsIgnoreCase("ye")|| userAnswer.equalsIgnoreCase("y")){
                ask = true;}
            else {
                ask = false;

                System.out.println("Thank you for using the HR Salary Calculator!");
            }
        }

    }
        //Adding Method
        public static double add(double fstNumber, double scndNumber){
            double intResult = fstNumber + scndNumber;
            return intResult;

        }
        //Subtraction Method
        public static double subtract(double fstNumber, double scndNumber){
            double intResult = fstNumber - scndNumber;
            return intResult;
        }

        //Multiplication Method
        public static double multiply(double fstNumber, double scndNumber){
            double intResult = fstNumber * scndNumber;
            return intResult;
        }

        //Division Method
        public static double divide(double fstNumber, double scndNumber){
            double intResult = fstNumber / scndNumber;
            return intResult;
        }

}

