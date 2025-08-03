public class IsSorted {
    public static boolean func(int arr[], int n){
        for(int i =1;i< n;i++){
            if(arr[i] < arr[i -1]){
                return false;
            }
        }
        return true;
    }
    public static void main (String args[]){
        int arr[] = {1, 2, 3, 4, 5}, n = 5;
        System.out.println(func(arr, n));
    }
}
