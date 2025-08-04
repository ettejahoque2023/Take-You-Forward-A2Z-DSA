public class MoveZero {
    public static int[] solution(int a[]){
        int n =a.length;
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return a;
        }

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;

    }
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        solution(nums);
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]);
        }

    }
}
