package String;

import java.util.Scanner;

public class intToStringBuild {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        String s= Integer.toString(a);
        System.out.println(s.length());


    }
}
