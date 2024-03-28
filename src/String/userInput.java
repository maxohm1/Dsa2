package String;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        String s= "abc"+a;
        System.out.println(s+"merge");
    }
}
