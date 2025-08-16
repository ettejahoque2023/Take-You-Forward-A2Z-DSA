public class FindX {
    public static int solution(int []arr,int k){
        int start = 0;
        int end=arr.length - 1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]== k){
                return mid;
            }else if(arr[mid]>k){
                end= mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = solution(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
}
