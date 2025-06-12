package marrix;

import java.util.Scanner;

public class input2DArray {
    void input(int arr[][], Scanner sc){
        System.out.println("enter the element in matrix");
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }



    }
}
