package com.recursion;

//reverse an array

import java.util.Scanner;


////reverse an array
//
//import java.util.Scanner;
//
//public class Question8 {
//
//    public static void reverse(int start,int end,int arr[]){
//        if(start>=end) return;
//
//        int temp=start;
//        start=end;
//        end=temp;
//        reverse(start++,end--,arr);
//
//
//    }
//
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//
//        int arr[]={10,20,30,40,50,60,70};
//
//        reverse(arr[0],arr[arr.length-1],arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print("  "+arr[i]);
//        }
//
//
//    }
//}


import java.util.Scanner;

public class Question8 {

    public static void reverse(int start, int end, int arr[]) {
        if (start >= end) return;

        // Swap elements at indexes start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call with updated indexes
        reverse(start + 1, end - 1, arr);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50, 60, 70};

        reverse(0, arr.length - 1, arr); // Pass indexes, not values!

        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }
    }
}

