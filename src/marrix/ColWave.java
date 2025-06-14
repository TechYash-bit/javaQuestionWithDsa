package marrix;

import java.util.ArrayList;
import java.util.Scanner;

public class ColWave {
    public static void main(String[] args) {
        System.out.println("Enter the row of in mitrix");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        System.out.println("Enter the column of matrix");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        output2DArray op=new output2DArray();
        op.input(arr,sc);
        System.out.println("you enter matrix is");
        op.output(arr);

        ArrayList list=colWaveArragment(arr);
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static ArrayList<Integer> colWaveArragment(int arr[][]){
        ArrayList<Integer> list = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;

        for (int j = 0; j < col; j++) {
            if (j % 2 == 0) {
                // top to bottom
                for (int i = 0; i < row; i++) {
                    list.add(arr[i][j]);
                }
            } else {
                // bottom to top
                for (int i = row - 1; i >= 0; i--) {
                    list.add(arr[i][j]);
                }
            }
        }

        return list;
    }
}
