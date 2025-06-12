package marrix;

import java.util.Scanner;

public class linerSearchIn2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row=sc.nextInt();
        System.out.println("Enter the number of col");
        int col=sc.nextInt();



        int arr[][] =new int[row][col];
        input2DArray ip=new input2DArray();
        ip.input(arr,sc);
        System.out.println("Enter the target element ");
        int target=sc.nextInt();

        int ans[]=linearSearch(arr,target);
        System.out.println("Element present at  row :"+ans[0]  +" col : "+ans[1]);

    }

    static int[] linearSearch(int arr[][],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target) return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
}
