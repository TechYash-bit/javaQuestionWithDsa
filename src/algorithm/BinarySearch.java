package algorithm;

import com.recursion.Array.ArrayInput;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[]=new int[size];
        System.out.println("please enter in increasing order");
        ArrayInput input=new ArrayInput();
        input.inputArray(arr,sc );

        System.out.println("Enter the target element ");
        int target=sc.nextInt();
        int res=binarySearch(arr,target);
        if(res==-1) System.out.println("Tareget element not present ");
        else{
            System.out.println(target+"present at "+res);
        }

    }
    public static int binarySearch( int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;

        while(start>end){
             mid=start+(end-start)/2;

             if(arr[mid]==target) return mid;
             else if(arr[mid]>target){
                 end=mid-1;
             }
             else{
                 start=mid+1;
             }

        }
        return -1;

    }
}
