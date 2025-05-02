package com.recursion.Array;

import java.util.Scanner;

//binary search using recursion
public class Queston3 {
    public static void main(String args[]){
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the " + i + " element in array");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target element");
        int target=sc.nextInt();

        int end=size-1;

        int index=binarySearch(0,end,target,arr);
        if(index==-1) System.out.println("element is not found");
        else
        System.out.println("element "+target+" found at index"+index);
    }

    static int binarySearch(int start,int end,int target,int arr[]){

        if(start>end) return-1;

        int mid=start+(end-start)/2;
        if(arr[mid]==target) return mid;
        else if (arr[mid]>target) {
            return binarySearch(start,mid-1,target,arr);
        }
        else{
            return binarySearch(mid+1,end,target,arr);
        }
    }
}
