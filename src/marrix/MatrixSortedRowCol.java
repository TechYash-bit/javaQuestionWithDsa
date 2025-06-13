package marrix;

public class MatrixSortedRowCol {
    public static void main(String[] args) {
        int arr[][]={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        int []ans=searchSortedRowCol(arr,37);
        System.out.println("element found at index row :"+ans[1]+" col:"+ans[1]);

    }

    static int[] searchSortedRowCol(int arr[][],int target){
        int row=0;
        int col=arr.length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }else if(arr[row][col]>target){
                col--;
            }
            else row++;
        }return new int[]{-1,-1};
    }
}
