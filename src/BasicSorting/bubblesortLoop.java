package BasicSorting;

public class bubblesortLoop {
    public static void print(int []arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr= {4,2,-2,7,9,1};
        print(arr);
        int n= arr.length;
        boolean flag= false;
        for(int x=0; x<n-1; x++){
            for(int i=0; i<n-1-x; i++){
                if(arr[i]>arr[i+1]){
                    int temp= arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]= temp;
                }
            }

        }
       print(arr);


    }
}
