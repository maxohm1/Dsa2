public class reverseArray {
    public static void main(String[] args) {
        int []a= {1,3,2,6,4,7,9};
      int i=1, j=a.length-1;
      while(i<=j){
          int temp= a[i];
          a[i]=a[j];
          a[j]= temp;
          i++;j--;
      }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k]+" ");
        }

    }

}
