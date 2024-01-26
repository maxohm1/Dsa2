import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] a ={{1,2},{3,4},{5,6}};
        int m= a.length, n = a[0].length;

        // column wise matrix(Transpose)
        for (int j = 0; j< n; j++) {  // column
            for (int i = 0; i < m; i++) {   // rows                 (row and column loop change matrix Transpose)
                //b[j][i]= a[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

}
