package marrix;

import java.util.Scanner;
//find the  col sum in matrix


public class ColumnWiseSum {
    public static void main(String[] args) {
        System.out.println("Enter the row of an mitrix ");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        System.out.println("Enter the col of array");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        output2DArray op=new output2DArray();
        op.input(arr,sc);

        System.out.println("the given array by you ");
        op.output(arr);

        colWiseSum(arr);

    }
    static void colWiseSum(int arr[][]){
        int col=arr[0].length;
        int row=arr.length;

        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum+=arr[j][i];
            }
            System.out.println("the sum of col in matrix is " +sum);
        }
    }
}
