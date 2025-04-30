package com.recursion.Array;
//check the element is present or not

import java.util.Scanner;

public class Question2 {
    public static void main(String args[]){
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the " + i + "element in array");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target element");
                int target=sc.nextInt();
        if(isElementPresent(arr,target,0)){
            System.out.println("the element is present");
        }else {
            System.out.println("the element is absent in array");
        }
    }

    static boolean isElementPresent(int arr[],int target,int index){
        if(index==arr.length) return false;
        return (arr[index]==target) ||isElementPresent(arr,target,index+1);
    }
}
