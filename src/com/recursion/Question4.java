package com.recursion;
//print a no from 1 to  n without using ++  solve by using recursion


import java.util.Scanner;

public class Question4 {
    static void print1(int count,int n){
        if(count==0) return;
        print1(--count,n);
        System.out.println(count);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enterr the no");
        int count=sc.nextInt();
        int n=count;

        print1(count,n);
    }
}
