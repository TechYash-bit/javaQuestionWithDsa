package com.recursion.Array;

import java.util.Scanner;
//date:-2 may 2025

public class ArrayInput
{




    public void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();
        }
    }
}
