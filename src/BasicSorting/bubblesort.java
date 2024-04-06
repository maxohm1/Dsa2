package BasicSorting;

public class bubblesort {
    public static void print(int[]arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr= {4,3,1,5,8,2}; // does not to get sorted this example
        //int []arr= {3,1,2,5,4};
        int n= arr.length;
        print(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }
        }
        print(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }
        }
        print(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }
        }
        print(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }

        }
        print(arr);   //this is the correct sort


    }
}
