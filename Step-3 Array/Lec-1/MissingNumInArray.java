
import java.util.Arrays;

public class MissingNumInArray {
    public static int missingNumber(int[]arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int arr[]={9,6,4,2,3,5,7,0,1,8};
        System.out.println(missingNumber(arr));
    }
}
