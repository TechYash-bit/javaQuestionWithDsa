package com.recursion.Array;

//check the given array is sorted or not
import java.util.Scanner;
public class Question1 {
    public static void main(String args[]) {

        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the " + i + "element in array");
            arr[i] = sc.nextInt();
        }

        boolean sorted = sortedOrNot(arr, 0);
        if(sorted){

        System.out.println("the given array is sorted");
    }else {
            System.out.println("the given array is not sorted");
        }
    }

    static boolean sortedOrNot(int arr[],int index){
        if(index==arr.length-1) return true;

        return index<index+1 && sortedOrNot(arr,index+1);
    }
}
