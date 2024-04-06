package BasicSorting;

public class selectionSort {
    public static void print(int []arr){
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr= {3,2,7,-9,0,-4};
        print(arr);
        System.out.println();
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int min= Integer.MAX_VALUE;
            int mindx= -1;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min= arr[j];
                    mindx= j;
                }
            }
            int temp= arr[i];
            arr[i]= arr[mindx];
            arr[mindx]= temp;

        }
        print(arr);
    }
}
