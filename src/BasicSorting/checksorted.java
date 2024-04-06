//package BasicSorting;

public class checksorted {
    public static void main(String[] args) {
        int arr[]= {3,8,9,12,43};
        int n= arr.length;
        boolean flag= false;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                flag=false;

            }
            else
                flag= true;
        }
        if(flag==false) System.out.println("unsorted");
        else System.out.println("sorted");
    }
}
