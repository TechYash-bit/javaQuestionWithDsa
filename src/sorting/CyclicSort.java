package sorting;

import com.recursion.Array.ArrayInput;

import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];
        ArrayInput ip=new ArrayInput();
        ip.inputArray(arr,sc);
        System.out.println("you enter array is");
        ip.output(arr);
        System.out.println("after sorting");
        cyclicSort(arr);
        ip.output(arr);
    }
    static void cyclicSort(int arr[]){
        int i=0;
        while(i<arr.length){
            int index=arr[i]-1;

            if(arr[index]!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else{
                i++;
            }
        }
    }
}
