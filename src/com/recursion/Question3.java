package com.recursion;

import java.util.Scanner;

//print a number from n to 1 using recursion
public class Question3 {
    static void print(int count){
        if(count<=0) return;

        System.out.println(count);
        count--;
        print(count);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
       int count= sc.nextInt();

       print(count);

    }
}
