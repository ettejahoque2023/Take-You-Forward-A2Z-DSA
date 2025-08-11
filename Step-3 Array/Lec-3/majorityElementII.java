import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityElementII {
    public static List<Integer>func(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        List <Integer> res = new ArrayList<>();
        int n= nums.length;
        for(int i =0;i<nums.length;i++){
            int value= hm.getOrDefault(nums[i],0);
            hm.put(nums[i],value+1);

        }
        for(Map.Entry<Integer,Integer> it : hm.entrySet()){
            int key = it.getKey();
            int cnt= it.getValue();
            if(cnt > n/3){
                res.add(key);
            }
        }
        if(res.size()==2 && res.get(0)> res.get(1)){
            int temp = res.get(0);
            res.set(0,res.get(1));
            res.set(1,temp);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr []={1,2,1};
        List <Integer> res =func(arr);

        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
