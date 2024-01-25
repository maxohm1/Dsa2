public class reverse {
    public static void swap(int a[], int i, int j){
        int temp= a[i];
        a[i]= a[j];
        a[j]= temp;
    }
    public static void main(String[] args) {
        int a[]= {1,2,6,4,5,8,7,87};
        int n=a.length;
        int i=2, j=6;
        while(i<=j){
         swap(a, i,j);
            i++; j--;
        }
      for(int ele:a){
          System.out.print(ele+" ");
        }
    }
}
