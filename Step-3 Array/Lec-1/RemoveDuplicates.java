
import java.util.HashSet;

public class RemoveDuplicates {
    public static int solution1(int arr[]){
        int j =0;
        for(int i =1;i<arr.length;i++){
            if(arr[i]!= arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
        }
    public static int solution2(int arr[]){
        int n = arr.length; 
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
            set.add(arr[i]);
        }
        int s = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,4,4,4,4};
        int k = solution1(arr);
        for(int i =0;i<k;i++){
            System.out.println(arr[i]);
        }
        int s= solution2(arr);
        for(int i =0;i<s;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
