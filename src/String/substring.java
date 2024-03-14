package String;

public class substring {
    public static void main(String[] args) {
        String s= "abcde";
        System.out.println(s.substring(1)); // print all after the index and itself
        System.out.println(s.substring(1,5));   // i to j-1
        System.out.println(s.substring(2,2));   //2 to 1 print so no ant print
        System.out.println(s.substring(2,3));  //2 to 2 print
        System.out.println(s.substring(0,5));   // print all string 0 to 4 index
    }
}
