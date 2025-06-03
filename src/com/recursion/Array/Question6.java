package com.recursion.Array;

//find the target element in the array return it index into ArrayList or list
//use Arraylist or LIst not passing parameter of a function and return ArrayList or list
//date:-3 may 2025

import java.util.ArrayList;
import java.util.Scanner;

public class Question6 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int[] arr=new int[size];

        ArrayInput input=new ArrayInput();
        input.inputArray(arr,sc);

        System.out.println("enter the target element ");
        int target=sc.nextInt();

        ArrayList<Integer> list=new ArrayList<Integer>();
        list=indexes(target,0,arr);

        System.out.println(list);


    }

    public static ArrayList<Integer> indexes(int target,int index,int arr[]){
        ArrayList<Integer> list=new ArrayList<Integer>();

        if(index==arr.length) return list;
        if(arr[index]==target) list.add(index);

        list.addAll(indexes(target,index+1,arr));

        return list;

    }
}
