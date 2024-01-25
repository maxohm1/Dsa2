public class sortZeroOne {
    public static void main(String[] args) {
        int a[]= {0,0,0,1,1,1,0};
        int n= a.length;
        int i=0, j=n-1;
        while (i<=j){
            if(a[i]==0){
                i++;
            }
            else if(a[j]==1){
                j--;
            }
            else if (a[i]==1 && a[j]==0){
                a[i]=0;
                a[j]=1;
                i++; j--;
            }
        }
        for(int ele: a){
            System.out.print(ele+" ");
        }
    }
}
