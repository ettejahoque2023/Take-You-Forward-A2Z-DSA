import java.util.HashMap;
import java.util.Map;

public class FreqOfHiAndLo {
    public static void main(String[] args) {
        int arr[]= {1,2,3,1,1,1,2,2,2,5,5,5,6,4,6,2,9,3,9,5,6};
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele, 0)+1);
        }


        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }
}
