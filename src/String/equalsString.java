package String;

public class equalsString {
    public static void main(String[] args) {
        String s= "abcxyz";
        String a= "abc";
        a= a+"xyz";  // new string form
        System.out.println(s==a);
        System.out.println(s.equals(a));
    }
}
