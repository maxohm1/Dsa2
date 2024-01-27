import java.util.Arrays;

public class swap1dArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int m= arr.length;
        int i=0, j=m-1;
        while(i<j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
//        System.out.println(Arrays.toString(arr));
//        for (int ele:arr){
//            System.out.print(ele+" ");
//        }
        for (int k = 0; k < m; k++) {
            System.out.print(arr[k]+" ");

        }
    }
}
