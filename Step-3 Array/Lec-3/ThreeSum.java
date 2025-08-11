import java.util.*;
public class ThreeSum {
    /*Solution 2- Brut Force 
     * Time complexity=O(n3)
    */
    public static List<List<Integer>> solution1(int arr[]){
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }


    /*Solution -2 */
    public static List<List<Integer>> solution2(int arr[]){
        Set<List<Integer>> st = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            Set <Integer> hs = new HashSet<>();
            for(int j = i+1;j<arr.length;j++){
                int third = -(arr[i] + arr[j]);
                if(hs.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hs.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }


    /*Solution 3 */
    public static List<List<Integer>> solution3(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return res;        
    }


    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        // int n = arr.length;

        /*Solution 1 */
        System.out.println("Solution 1");
        List<List<Integer>> ans1 = solution1(arr);
        for (List<Integer> it : ans1) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();

        System.out.println("Solution 2");
        /*Solution 2 */
        List<List<Integer>> ans2 = solution2(arr);
        for (List<Integer> it : ans2) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();

        /*Solution 3 */
        System.out.println("Solution 3");
        List<List<Integer>> ans3 = solution3(arr);
        for (List<Integer> it : ans3) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();

    }
}
