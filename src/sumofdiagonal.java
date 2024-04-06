public class sumofdiagonal {
    public static void main(String[] args) {
        int sum=0,ans=0;
        int [][]a= {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(i==j){
                    sum=sum+ a[i][j];
                }
            }
        }
        int i=0,j=a[0].length-1;
        while(i<a.length&&j>=0){
            if(i==j){
                ans=ans-a[i][j];
            }
             ans=ans+a[i][j];
            i++;
            j--;
        }
        System.out.println(sum);
        System.out.println(ans);
    }
}
