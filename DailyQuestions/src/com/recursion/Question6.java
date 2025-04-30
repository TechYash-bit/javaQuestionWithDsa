package com.recursion;



import java.util.*;
public class Question6 {
    static int sum1(int no,int sum){
        sum=no;

        if(no==0) return 0;

        return sum+sum1(no-1,sum);


    }

    static int sum2(int no) {
       if (no == 0) return 0;
       return no + sum2(no-1);
  }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no upto we have calculate sum" );
        int no=sc.nextInt();
        int num=sc.nextInt();
        int sum=0;
        int ans=sum1(no,sum);

        System.out.println("num"+num);
        System.out.print(ans);
    }
}



//import java.util.Scanner;
//
//public class Question6 {
//
//
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number up to which we want to calculate the sum:");
//        int no = sc.nextInt();
//        int num=sc.nextInt();
//
//        int ans = sum1(no);
//        System.out.println("Sum from 1 to " + no + " is: " + ans);
//        System.out.println(num);
//    }
//}

