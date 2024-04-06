public class swapReverse {
    public static void main(String[] args) {
        int []a= {1,5,3,6,5,9,2,8};

       int i=0, j=a.length-1;
       while(i<=j){
           int temp= a[i];
           a[i]= a[j];
           a[j]= temp;
           i++; j--;
       }
        for (int k = 0; k < a.length-1; k++) {
            System.out.print(a[k]+" ");
        }
    }
}
