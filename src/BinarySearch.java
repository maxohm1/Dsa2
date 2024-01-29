import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []a= new int[8];
        System.out.println("enter the element of array");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println("enter the element to be search");
     int key= sc.nextInt();
            int start= 0, end=a.length-1;
            while(start<=end) {
                int mid = (start + end) / 2;
                if (key > a[mid]) {
                    start = mid + 1;
                } else if (key>a[mid]){
                    end = mid - 1;
                }
                else{
                    System.out.println("element at index "+mid);
                    return;
                }
            }
            System.out.println(-1);
        }

    }

