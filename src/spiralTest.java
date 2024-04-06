public class spiralTest {
//    public static void print(int a[][]){
//        int m= a.length, n= a[0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {
        int [][]a= {{1,2,3,4,50},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        int m= a.length, n= a[0].length;
       // print(a);
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//        }
        // spiral print
        int minr=0, maxr=m-1;
        int minc=0, maxc= n-1;
        while(minc<=maxc && minc<= maxc){
            // left to right
            for (int j = minr; j <= maxr; j++) {
                System.out.print(a[minr][j]+" ");
            }
            minr++;
            // up to down
            for (int i = minr; i <=maxr ; i++) {
                System.out.print(a[i][maxc]+" ");
            }
            maxc--;
            // Right to left
            if (minc> maxc) break;
            for (int j = maxc; j >= minc; j--) {
                System.out.print(a[maxr][j]+" ");
            }
            maxr--;
            // down to up
            if (minr>maxr) break;
            for (int i = maxr; i >=minr ; i--) {
                System.out.print(a[i][minc]+" ");
            }
            minc++;
        }
    }
}
