package pwClass;

import java.util.Scanner;

public class secondLargestno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] a = new int[4][3];
        int max1=Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j]= sc.nextInt();
          }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if(a[i][j]>max1){
                    max2= max1;
                    max1= a[i][j];
                }
                else{
                    if(a[i][j]>max2){
                        max2= a[i][j];
                    }
                }
            }
            System.out.println();
        }
        System.out.println("second largest element is: "+max2);
        
    }
}
