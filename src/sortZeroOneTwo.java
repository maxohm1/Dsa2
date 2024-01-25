public class sortZeroOneTwo {
    public static void swap(int a[], int i, int j){
        int temp= a[i];
        a[i]= a[j];
        a[j]= temp;
    }
    public static void main(String[] args) {
      int a[]= {1,2,0,0,1,2,1,0};
      int n= a.length;
     int low=0, mid=0, hi=n-1;
      while(mid<=hi){
        if (mid==0){
            swap(a, mid, low);
            low++; mid++;
        }
        else if(mid==1){
            mid++;
        }
        else{
            swap(a, mid, hi);
               mid++;hi--;
        }
      }
      for(int ele:a){
          System.out.print(ele+" ");
      }


    }
}
