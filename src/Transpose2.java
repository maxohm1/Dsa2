import java.util.Scanner;

public class Transpose2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] a = new int[3][2];
        int m= a.length;
        int n= a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]= sc.nextInt();
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println();
        int[][] b = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j]= a[j][i];
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }


    }
}
