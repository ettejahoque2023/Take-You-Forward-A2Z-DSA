public class ReverseAnArray {
    public static void func(int arr[], int start, int end){
        if (start < end) {
         int tmp = arr[start];
         arr[start] = arr[end];
         arr[end] = tmp;
         func(arr, start + 1, end - 1);
      }
    }
    public static void printArray(int arr[], int n) {
      System.out.print("Reversed array is:-");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        int n = arr.length;
        func(arr, 0,n-1);
        printArray(arr, n);
    }
}
