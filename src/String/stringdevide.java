package String;

public class stringdevide {
    public static void main(String[] args) {
        int n= 2468023;
        String s= n+"";
        int count=0;
        //System.out.println(s);
        System.out.println(s.length());
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)%2==0){
              count++;
            }
        }
        System.out.println(count);
    }
}
