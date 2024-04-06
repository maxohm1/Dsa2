import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int a[]= {1,4,5,3,8};
        for(int ele: a){
            System.out.print(ele+" ");
        }
        Arrays.sort(a);
        System.out.println();
        for(int ele: a){
            System.out.print(ele+" ");
        }
    }
}
