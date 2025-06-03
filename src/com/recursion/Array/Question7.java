package com.recursion.Array;

import java.util.ArrayList;
import java.util.Scanner;

//find the maximum and minimum element in array
//Date:-5 may 2025
public class Question7 {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] arr=new int[size];

        ArrayInput input=new ArrayInput();
        input.inputArray(arr,sc);

        int[] ans=new int[2];

        int indexs[]=index(arr,0,ans);

        int max=indexs[1];
        int min=indexs[0];

        System.out.println("maximum : "+max+" minimum : "+min);
    }
    public static int[] index(int arr[],int index,int ans[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        if(arr.length==index) return ans;

        if(arr[index]>max){
            ans[1]=arr[index];

        }
        else if(arr[index]<min){
            ans[0]=arr[index];
        }

        return index(arr,index+1,ans);
    }
}
