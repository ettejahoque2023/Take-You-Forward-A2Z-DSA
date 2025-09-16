import java.util.*;
public class FreqOfArrayEle {
    public static void main(String[] args) {
        int arr[]= {1,2,3,1,1,1,2,2,2,5,5,5,6,4,6,2,9,3,9,5,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele, 0)+1);
        }
        for(Integer i : map.keySet()){
            System.out.println(i+"="+map.get(i));
        }
    }
}
