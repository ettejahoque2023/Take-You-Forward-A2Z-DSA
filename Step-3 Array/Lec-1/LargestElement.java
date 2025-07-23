public class LargestElement {
    public static int largest(int[] nums) {
        // code here
        int large=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>large){
                large = nums[i];
            }
        }
        return large;
    }
    public static void main (String args[]){
        int []arr={3,2,45,6,71};
        int large = largest(arr);
        System.out.println(large);

    }
}
