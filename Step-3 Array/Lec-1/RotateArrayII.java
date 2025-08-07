public class RotateArrayII {
    public static  void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        for(int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }        
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        rotate(nums, 3);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
