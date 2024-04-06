import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int[] a = new int[7];
        System.out.println("enter the element of array");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the searchable element");
        int key=sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if(a[i]==key){
                System.out.println("position at found "+(i+1));

            }
        }
    }
}
