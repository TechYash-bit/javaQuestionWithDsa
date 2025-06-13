package marrix;

import java.util.Scanner;
//find the largest row sum in matrix

public class LargestRowSum {
    public static void main(String[] args) {
        System.out.println("Enter the number of row");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        System.out.println("Enter the number of col");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];

        output2DArray op=new output2DArray();
        op.input(arr,sc);
        System.out.println("the matrix you enter is ");
        op.output(arr);

        int largestsum=higestRowSum(arr);
        System.out.println("the largest sum is "+largestsum);
    }
    static int higestRowSum(int arr[][]){
        int max=Integer.MIN_VALUE;
        int row =arr.length;
        int col=arr[0].length;
        int index=-1;

        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum+=arr[i][j];
            }
            if(max<sum){
                max=sum;
                index=i;
            }
        }
        System.out.println("the row index is "+index);
        return max;
    }
}
