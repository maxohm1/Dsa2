import java.util.Scanner;

public class matrixLargest2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] a = new int[3][3];
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]= sc.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                max= Math.max(max,a[i][j]);
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             sum = sum+a[i][j];
            }

        }

        System.out.println("Maximum no is "+max);
        System.out.println("Sum of all array is "+sum);

    }
}
