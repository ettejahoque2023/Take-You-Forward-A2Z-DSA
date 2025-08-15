import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static ArrayList<Integer> solution(int mat[][]){
                ArrayList<Integer> list = new ArrayList<>();
        
        int n = mat.length;
        int m = mat[0].length;
        
        //Declearing variables
        
        int sr= 0;
        int er = n -1;
        int sc = 0;
        int ec= m-1;
        
        while(sr<=er && sc<=ec){
        //TOP border
        for(int i= sc;i<=ec;i++){
            list.add(mat[sr][i]);
        }
        
        //Right border
        for(int j=sr+1;j<=er;j++){
            list.add(mat[j][ec]);
        }
        //bottom border
        for(int i=ec-1;i>=sc;i--){
            if(sr == er){
                break;
            }
            list.add(mat[er][i]);
        }
        
        //Left border
        for(int j = er-1;j>=sc+1;j--){
            if(sc == ec){
                break;
            }
            list.add(mat[j][sc]);
        }
        
        sr++;
        er--;
        sc++;
        ec--;
        }
        return list;
    }
    public static void main(String[] args) {
         int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
         List<Integer> ans = solution(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}
