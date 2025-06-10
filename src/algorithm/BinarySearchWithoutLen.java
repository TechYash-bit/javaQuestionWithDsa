package algorithm;
import com.recursion.Array.ArrayInput;

import java.util.*;

public class BinarySearchWithoutLen {
    public static void main(String args[]){
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];
        ArrayInput ip=new ArrayInput();
        ip.inputArray(arr,sc);

        System.out.println("enter the target element");
        int target=sc.nextInt();
         int ans=search(arr,target);
        System.out.println(ans);

    }
    public static int search(int[] nums, int target) {
        int start=0;
        int end=1;

        while(target>nums[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;

            start=newstart;

        }
        return search(nums,target,start,end);


    }
    public static int search(int nums[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;

            else if(nums[mid]>target) end=mid-1;

            else{
                start=mid+1;
            }
        }
        return -1;

    }
    }



