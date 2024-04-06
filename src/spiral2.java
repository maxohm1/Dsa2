public class spiral2 {
    public static void print(int [][]a){
        int m= a.length, n= a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [][]a= {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
        int m= a.length, n= a[0].length;
        print(a);
        // spiral print
        int minr=0, maxr=m-1;
        int minc=0, maxc=n-1;
        while (minr<= maxr && minc<= maxc){
            // left to right
            for (int j = minc ; j <=maxc ; j++) {
                System.out.print(a[minr][j]+" ");
            }
            minr++;
            // top to bottom
            for (int i = minr; i <= maxr; i++) {
                System.out.print(a[i][maxc]+" ");
            }
            maxc--;
            // right to left
            for (int j = maxc; j >=minc; j--) {
                System.out.print(a[maxr][j]+" ");
            }
            maxr--;
            // bottom to top
            for (int i = maxr; i >=minr ; i--) {
                System.out.print(a[i][minc]+" ");
            }
            minc++;

        }
    }
}
