package BasicSorting;

public class minArray {
    public static void main(String[] args) {
        int[] arr = {3,5,-20,0,9,-9};
        int min= Integer.MAX_VALUE;
        int n= arr.length;
        int mindx= -1;
       for(int i=0; i<n; i++){
           if(arr[i]<min){
               min= arr[i];
               mindx= i;
           }
       }
        System.out.println(min+ " index : "+mindx);
    }
}
