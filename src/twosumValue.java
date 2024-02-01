public class twosumValue {
    public static void main(String[] args) {
        int b[]= new int[2];
        int []a= {1,3,4,2,6};
        int key=7;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1+1; j < a.length; j++) {
                if(a[i]+a[j]==key){
                    b[0]=a[i];
                    b[1]=a[j];
                    System.out.println(b[0]+" "+b[1]);
                }
            }
        }
    }
}
