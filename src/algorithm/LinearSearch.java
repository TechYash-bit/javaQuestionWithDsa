package algorithm;
import com.recursion.Array.ArrayInput;

import java.util.*;

public class LinearSearch {
    public static void main(String args[]){
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        ArrayInput input=new ArrayInput();
        input.inputArray(arr,sc);

        System.out.println("Enter the target element ");
        int target=sc.nextInt();

        int res=linearSearch(arr,target);
        if(res== -1) System.out.println("Target element not present");
        else{
            System.out.println(target+"element present at "+res);
        }


    }
    public static int linearSearch(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
}
