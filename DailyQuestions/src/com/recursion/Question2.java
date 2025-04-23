package com.recursion;
//p[rint from 1 to n

import java.util.Scanner;

public class Question2 {
    static void print(int count,int n){
        if(count>n) return;
        System.out.println(count);
        print(count+1,n);
    }
    public static void main(String args[]){
        int count=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. upto print :-");
        int n=sc.nextInt();

        print(count,n);
    }
}
