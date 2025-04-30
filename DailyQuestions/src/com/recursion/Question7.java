package com.recursion;
//fibonaci serise

import java.util.*;
public class Question7 {

    static int  fibo(int place){

        //if apply if(place<=0) then it will return negative value sometime
        if(place==0 | place==1) return place;

        return fibo(place-1)+fibo(place-2);
    }

    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enteer the position of an element");

        int place=sc.nextInt();

        int ans=        fibo(place);

        System.out.println("the element at position "+ place+ "  in fibonaci is  "+ans);;
    }}
