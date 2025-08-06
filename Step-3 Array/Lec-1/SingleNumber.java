import java.util.HashMap;

public class SingleNumber {
    public static int solution(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
             hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(Integer it : hm.keySet()){
            if(hm.get(it) == 1){
                return it;
            }   
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]= {2,2,1};
        System.out.println(solution(nums));
    }
}
