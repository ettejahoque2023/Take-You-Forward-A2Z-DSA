import java.util.*;
public class LongestSubarraySumZero {
    public static int solution (int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxi =0;
        int sum =0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
            if(sum ==0){
                maxi= i+1;
            }else{
                if(hm.get(sum) != null){
                    maxi= Math.max(maxi,i-hm.get(sum));
                }else{
                    hm.put(sum,i);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[]={9, -3, 3, -1, 6, -5};
        System.out.println(solution(arr));
    }
}
