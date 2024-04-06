//import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
      //  Scanner sc= new Scanner(System.in);
        int[][] a = {{1,2,3}, {5,5,7}, {7,8,9}};
        int[][] b = {{9,4,7},{6,8,4},{3,2,9}};
        int m= a.length;
        int n= b[0].length;
        int[][] sum= new int[m][n];
        System.out.println("sum of two matrix is ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              sum[i][j]= a[i][j]+b[i][j];
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }


    }
}
