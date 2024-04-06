public class rotateArrayTest {
    public static void main(String[] args) {
        int [][]a= {{14,2,3},{4,5,6},{7,8,9}};
        int m= a.length;
        int [][]b= new int[m][m];
        for (int i = 0; i <3; i++) {
            for (int j = 2; j>=0 ; j--) {
                b[i][j]= a[j][i];
                System.out.print(b[i][j]+" ");
            }
            System.out.println();

        }
    }
}
