import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlapping {
    public static int [][] solution(int [][]intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                merged.add(prev);
                prev = interval;
            }
        }

        merged.add(prev);

        return merged.toArray(new int[merged.size()][]);  
    }
    public static void main(String[] args) {
         int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        int[][] ans =solution(arr);
        System.out.print("The merged intervals are: \n");
       for(int i=0;i<ans.length;i++){
        for(int j=0;j<ans[0].length;j++){
        System.out.print(ans[i][j]+" ");
       }
    }
        System.out.println();
    
}
