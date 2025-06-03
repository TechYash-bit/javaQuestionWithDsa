package com.recursion;
//power of 3
//date 7 may 2025

import java.util.Scanner;

public class Question10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the power of 3 which have to calculate ");
        int power=sc.nextInt();

        float ans=1;

        float answer=powerOfThreee(power,ans);
        System.out.println("answer : "+answer);

    }
    public static float powerOfThreee(int power,float ans){
        if(power==0){
            return (ans);
        }
        else if(power>0){
            ans=ans*3;
            return powerOfThreee(power-1,ans);
        }
        else{
            ans=ans/3;
            return powerOfThreee(power+1,ans);
        }

    }
}
