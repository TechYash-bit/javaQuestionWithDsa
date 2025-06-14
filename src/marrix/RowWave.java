package marrix;

import java.util.ArrayList;
import java.util.Scanner;

public class RowWave {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row");
        int row=sc.nextInt();
        System.out.println("Enter the col size");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];

        output2DArray op=new output2DArray();
        op.input(arr,sc);
        System.out.println("you enter the matrix is ");
        op.output(arr);

        ArrayList<Integer> list=rowWave(arr);
        for (int item : list) {
            System.out.println(item);
        }
    }

    static ArrayList<Integer> rowWave(int arr[][]){
        ArrayList<Integer> list=new ArrayList<>();
        int row=arr.length;
        int col=arr[0].length;

        for(int i=0;i<row;i++){
            if(i%2==0){
                for(int j=0;j<col;j++){
                    list.add(arr[i][j]);
                }
            }
            else{
                for(int j=col-1;j>=0;j--){
                    list.add(arr[i][j]);
                }
            }
        }
        return list;
    }
}
