package marrix;

import java.util.Scanner;

public class matrixMaking {public static  void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row=sc.nextInt();
    System.out.println("Enter the number of col");
    int col=sc.nextInt();

    int arr[][] =new int[row][col];
    input2DArray ip=new input2DArray();
    ip.input(arr,sc);

    output2DArray op=new output2DArray();
    op.output(arr);
}
}
