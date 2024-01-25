public class rotateArray {
    public static void swap(int a[], int i, int j){
        while (i<=j){
            int temp =a[i];
            a[i]= a[j];
            a[j]= temp;
            i++; j--;
        }
    }
    public static void main(String[] args) {
        int a[]= {2,4,3,7,9,5};
        int k=8;
        int n=a.length;
        k=k%n;
        swap(a,0, n-k-1);
        swap(a,n-k, n-1);
        swap(a,0, n-1);
        for(int ele:a)
            System.out.print(ele+" ");
    }
}
