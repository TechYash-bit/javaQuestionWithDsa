package marrix;

public class output2DArray extends input2DArray {
    void output(int num[][]){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
