public class waveTest {
    public static void main(String[] args) {
        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int m= a.length;
        for (int i = 0; i < m; i++) {
            for (int j = m-1; j >=0 ; j--) {
                for (int k = 0; k <m ; k++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }

        }
    }
}
