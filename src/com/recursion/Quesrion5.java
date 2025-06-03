package com.recursion;
//print the no from n to 1 using recursion
//note :- dont use -- operator

import java.util.Scanner;

public class Quesrion5 {

    static void print(int count,int n){
        if(count>n) return;
        print(count+1,n);
        System.out.println(count);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        int count=0;
        print(count,n);
    }
}
