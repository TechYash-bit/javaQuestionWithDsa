package sorting;

import com.recursion.Array.ArrayInput;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();


         int arr[]=new int[size];
        ArrayInput ip=new ArrayInput();
        ip.inputArray(arr,sc);
        System.out.println("you Enter array is ");
        ip.output(arr);
        System.out.println("After sorting array will be");
        bubbleSort(arr);
        ip.output(arr);

    }
    static void bubbleSort(int arr[]){
        boolean swaped=false;

        for(int i=0;i<arr.length-1;i++){
            swaped=false;
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swaped=true;
                }
            }
            if(!swaped) break;
        }
    }
}
