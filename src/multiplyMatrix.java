public class multiplyMatrix {
    public static void print(int [][]a){
        int m= a.length;
        int n= a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [][]a= {{1,2,1}, {4,5,6}};
        int [][]b={{1,2,3},{2,1,1},{2,1,3}};
        int [][]c= new int[a.length][b[0].length];
        if(a[0].length!= b.length){
            System.out.println("multiplication not possible");
        }
        else {
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        c[i][j] += a[i][k] * b[k][j];

                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();

            }
        }


    }

}
