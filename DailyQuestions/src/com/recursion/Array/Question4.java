package com.recursion.Array;

import java.util.Scanner;

//apply linear search using recursion
public class Question4 {
    public static void main(String args[]){
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the " + i + " element in array");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target element :");
        int target=sc.nextInt();

        int index=linearSearch(0,target,arr);
        if(index==-1) System.out.println("the element is not present in the array");
        else
        System.out.println("then element "+target+"is found at"+index);
    }

    static int linearSearch(int index,int target,int arr[]){
        if(index==arr.length) return -1;
        if(arr[index]==target) return index;
        return linearSearch(index+1,target,arr);
    }
}
