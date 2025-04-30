package com.recursion;
//check whethere the string is palindrome or not

import java.util.*;



public class Question9 {

    static boolean palindrome(int start,int end,String str){
        if(start>=end)return true;
            if(str.charAt(start)==str.charAt(end)) {
               return palindrome(start+1,end-1,str);

            }
          return false;


    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the string to check ");
        String str=sc.next();

        int start=0;
        int end=str.length()-1;

        boolean ans=palindrome(start,end,str);
        System.out.println(ans);

        System.out.println("continue or not: yes/no");
        String con=sc.next();

        if(con.equalsIgnoreCase("yes")){
            main(args);
        }

    }
}
