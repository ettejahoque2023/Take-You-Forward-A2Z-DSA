import java.util.*;
public class MergeTwoSortedArray {
    public static void solution(int[] nums1, int[] nums2) {
        int k =0;
        for(int i =0;i<nums1.length;i++)
        {
            nums1[k++] = nums1[i];
        }
        for(int i =0;i<nums2.length;i++){
            nums1[k++]= nums2[i];
        }

    Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        solution(nums1, nums2);

    }
}
