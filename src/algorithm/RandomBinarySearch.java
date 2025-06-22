package algorithm;

import com.recursion.Array.ArrayInput;

import java.util.Scanner;

public class RandomBinarySearch {
    public static void main(String args[]){
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        ArrayInput ip=new ArrayInput();
        ip.inputArray(arr,sc);
        System.out.println("you enter the sorted array is ");
        ip.output(arr);
        System.out.println("Enter the target element ");
        int target=sc.nextInt();

        int ans=augmentedBinarySearch(arr,target);
        System.out.println(ans);


    }
    static  int augmentedBinarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        if(arr[start]<arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
            else{
                while(start<=end){
                    int mid=start+(end-start)/2;

                    if(arr[mid]==target){
                        return mid;
                    }
                    else if(arr[mid]<target){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }

        }
        return -1;
    }
}
