package marrix;

import java.util.Scanner;
////find the  row sum in matrix

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row present in array");
        int row=sc.nextInt();

        System.out.println("Enter the col present in array");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        output2DArray ip=new output2DArray();
        ip.input(arr,sc);
        System.out.println("the given array is ");
        ip.output(arr);


        System.out.println("the sum of row in 2 d array is given by");
        rowWiseSum(arr);

    }
    static void rowWiseSum(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }

            System.out.println("row "+(i+1)+" is "+sum);
        }
    }
}
