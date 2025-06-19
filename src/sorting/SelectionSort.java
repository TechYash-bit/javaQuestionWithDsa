package sorting;

import com.recursion.Array.ArrayInput;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        ArrayInput ip=new ArrayInput();
        ip.inputArray(arr,sc);
        System.out.println("you Enter the array is");
        ip.output(arr);
        selectionSort(arr);
        System.out.println("after sorting ");
        ip.output(arr);
    }
    static void selectionSort(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            int index=largest(arr,0,i);
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
    static int largest(int arr[],int start,int end){
        int max=start;
        int index=0;
        for(int i=0;i<=end;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
}
