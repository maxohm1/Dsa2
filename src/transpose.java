import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] a = new int [2][3];
        int m=a.length;
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
        int[][] b = new int[3][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j]= a[j][i];
                System.out.print(b[i][j]+" ");

            }
            System.out.println();
        }
    }
}
