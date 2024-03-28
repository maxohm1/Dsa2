package String;

public class stringCompression {
    public static void main(String[] args) {
        String s= "aaaabbcccdddddd";
        char []a=s.toCharArray();
        String ans="";
        int i=0, j=0;
        while(j<s.length()){
            if(a[j]== a[i]){
                j++;
            }
            else{
                ans= ans+a[i];
                int len= j-i;
                ans=ans+len;
                i=j;

            }
        }
        ans= ans+a[i];
        int len= j-i;
        ans= ans+len;
        System.out.println(ans);
    }
}
