public class wave3 {
    public static void main(String[] args) {
        int [][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m= arr.length;
        for (int j = m-1; j >=0; j--) {
            if (j%2 == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for (int i = m-1; i >=0 ; i--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
