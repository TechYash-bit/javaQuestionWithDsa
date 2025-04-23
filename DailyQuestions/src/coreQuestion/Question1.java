package coreQuestion;// write a program to  calculate addition of two  number    date:-17 april 2025

import java.util.Scanner;

public class Question1{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println ("enter the first number");
        int frist=sc.nextInt();

        System.out.println("enter the second number");
        int second=sc.nextInt();
        int add=frist+second;

        System.out.println("the addition of "+frist+"and "+second+" number is"+add);
    }
}