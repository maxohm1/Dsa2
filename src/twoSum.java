public class twoSum {
    public static void main(String[] args) {
        int a[]= {1,2,7,3,4};
        int target= 10;
        int n= a.length;
        int solve=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]+a[j]==target){
                    System.out.println("index is:\n"+i+" "+j);
                }
            }
        }

    }
}
