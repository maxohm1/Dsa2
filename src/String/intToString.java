package String;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the integer");
        int a= sc.nextInt();
        String s= ""+a;
        System.out.println(s);
        System.out.println(s.length());
    }
}
