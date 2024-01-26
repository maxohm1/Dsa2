import java.util.Scanner;

public class matrixLargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[][] = new int[3][3];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if (a[i][j]>max)
                   max= a[i][j];
            }
        }
        System.out.println("Maximum element of 2d array is "+max);

    }
}
