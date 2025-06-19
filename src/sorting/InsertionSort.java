package sorting;

import com.recursion.Array.ArrayInput;

import java.util.Collections;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        ArrayInput ip=new ArrayInput();
        ip.inputArray(arr,sc);
        System.out.println("the  array before sorting is");
        ip.output(arr);

        System.out.println("the array after sorting");
        insertionSort(arr);
        ip.output(arr);
    }
    static void insertionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1; j>0;j--){
                if(arr[j]<arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
