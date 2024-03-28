package String;

public class UpdateEven {
    public static void main(String[] args) {
        String s= "mpxohm";
        String str="";
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0){
                str= str+'a';
            }
            else{
                str= str+s.charAt(i);
            }
        }
        s=str;
        System.out.println(s);
    }
}
