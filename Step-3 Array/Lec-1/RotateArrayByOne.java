public class RotateArrayByOne {
    public static void solution1 (int arr[],int n){
       int temp = arr[0];
       int temparr[]=new int [n];
       for(int i=1;i<n;i++){
        temparr[i-1]=arr[i];
       }
       temparr[n-1]=temp;
       for(int i =0;i<n ;i++){
            System.out.print(temparr[i]+" ");
        }
       
    }

    public static void solution2(int arr[], int n){
        int temp = arr[0];
        for(int i =0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        int n =5;
         for(int i =0;i<n ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        solution1(arr, n);
        solution2(arr, n);
        System.out.println();
         for(int i =0;i<n ;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
