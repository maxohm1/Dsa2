
import java.util.Scanner;

public class SumMatrices {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int n= a.length;
        int m= b.length;
        int[][] sum =new int[n][m];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j]= sc.nextInt();
            }

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j]= sc.nextInt();
            }

        }
        System.out.println("sum of two matrix is ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                 sum[i][j]= a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");

            }
            System.out.println();

        }
    }
}
