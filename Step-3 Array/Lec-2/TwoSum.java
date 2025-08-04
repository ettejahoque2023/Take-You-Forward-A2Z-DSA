public class TwoSum {
    public static int[] sol(int[] nums, int target) {
        int sum =0;
        int [] arr = new int [2];
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++)
            {
                sum = nums[i] + nums[j];
                if(sum == target){
                    arr[0]=i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
    public static void main (String args[]){
        int nums[]={2,7,11,15};
        int target=9;
        int a[]= sol(nums,target);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
