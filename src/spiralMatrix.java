public class spiralMatrix {
    public static void main(String[] args) {
        int [][]a= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int m= a.length, n= a[0].length;
        int minr=0, maxr=m-1;
        int minc=0, maxc=n-1;
        while(minr<= maxc && minc <= maxc){
            for (int j =minc; j < maxc; j++) {
                System.out.print(a[minr][j]+" ");
            }
            minr++;
            if(minr>maxc && minc >maxc) break;
            for (int i = minr; i <=maxr; i++) {
                System.out.print(a[i][maxc]+" ");
            }
            maxc--;
            if(minr>maxc && minc > maxc) break;
            for (int j = maxc; j >=minc ; j--) {
                System.out.print(a[maxr][j]+" ");
            }
            maxr--;
            if(minr> maxc && minc > maxc) break;
            for (int i = maxr; i >=minr ; i--) {
                System.out.print(a[i][minc]+" ");
            }
            minc++;
        }
    }
}
