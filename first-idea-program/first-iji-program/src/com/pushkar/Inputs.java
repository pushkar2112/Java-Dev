package com.pushkar;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter some input: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll no is: " + rollno);

//        String name = input.nextLine();
//        System.out.println(name);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
