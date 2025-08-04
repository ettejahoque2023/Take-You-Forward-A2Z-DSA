import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Unionarray {
    public static ArrayList<Integer> solution1(int arr1[],int arr2[],int n, int m){
        HashMap <Integer,Integer > freq=new HashMap<>();
        ArrayList<Integer> Union=new ArrayList<>();
        for (int i = 0; i < n; i++){
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
        }
        for (int i = 0; i < m; i++){
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        }
        for (int it: freq.keySet()){
            Union.add(it);
        }
  return Union;
    }
    public static ArrayList<Integer> solution2(int arr1[] , int arr2[],int n , int m){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
            set.add(arr1[i]);

        }
        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }
        ArrayList<Integer> res = new ArrayList<>();

        for (int it: set){
            res.add(it);
        }
        return res;
    }
    public static void main (String args[]){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,1,4,3,7};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> Union1 = solution1(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union1){
            System.out.print(val+" ");
        }
        ArrayList<Integer> Union2 = solution2(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union2){
            System.out.print(val+" ");
        }
    }
}
