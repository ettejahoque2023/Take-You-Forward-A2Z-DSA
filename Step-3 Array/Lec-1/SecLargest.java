import java.util.*;
public class SecLargest {
    public static int Secondlargest(int[] arr){
        int n =arr.length;
        Arrays.sort(arr);
        for(int i =n -2;i>=0;i--)
        {
            if(arr[i] !=arr[n-1] )
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={3,2,45,6,71};
        int large = Secondlargest(arr);
        System.out.println(large);
    }
}
