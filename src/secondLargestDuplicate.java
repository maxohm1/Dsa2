import java.util.Scanner;

public class secondLargestDuplicate {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []a= new int[5];
        int max1=Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max1) {
                max2= max1;
                max1=a[i];
            }
            else if(a[i]>max2 && a[i]!= max1){
                max2= a[i];
            }
        }
        System.out.println("second largest element is "+max2);
    }
}
