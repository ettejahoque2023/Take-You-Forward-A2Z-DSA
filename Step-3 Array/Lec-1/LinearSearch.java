public class LinearSearch {
    public static int solution(int arr[],int num){
        for(int i=0;i< arr.length;i++){
            if( num == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int arr[] ={1,3,4,2,6};
        int num = 6;
        System.out.println(solution(arr, num));
    }
}
