public class SelectionSort {
    public static void func(int []arr){
        for(int i =0;i<arr.length ;i++){
            int min =i;
            for(int j =i+1;j<arr.length- 1-i;j++){
                if(arr[min] > arr[j]){
                    int temp = arr[j];
                    arr[j]= arr[min];
                    arr[min]=temp;
                }
            }
        }
    }
    public static void print(int []arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
         int arr []={2,4,5,8,1};
        func(arr);
        print(arr);
    }
    
}
