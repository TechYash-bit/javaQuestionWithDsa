package com.recursion.Array;

import java.util.ArrayList;
import java.util.Scanner;

//find the target element in the array return it index into ArrayList or list
//use Arraylist or LIst as a parameter of a function and return ArrayList or list
//date:-2 may 2025
public class Question5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        ArrayInput input = new ArrayInput();
//        input.inputArray( arr,sc);
        input.inputArray(arr, sc);

        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        findIndex(arr, list, target, 0);

        System.out.println("Target found at indices: " + list);
    }

    public static ArrayList<Integer> findIndex(int[] arr, ArrayList<Integer> list, int target, int index) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findIndex(arr, list, target, index + 1);
    }

}
