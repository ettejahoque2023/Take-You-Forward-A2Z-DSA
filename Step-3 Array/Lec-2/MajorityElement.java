import java.util.HashMap;
//import java.util.Set;

public class MajorityElement {
    public static int solution(int[]nums){
         int n= nums.length;

        HashMap<Integer,Integer> map = new HashMap <> ();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }

        }
        //Set <Integer> keySet = map.keySet();
        for(Integer key : map.keySet()){
            if(map.get(key) > n/2){
                return(key);
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int nums []= {2,2,1,1,1,2,2};
        System.out.println(solution(nums));
    }
}
