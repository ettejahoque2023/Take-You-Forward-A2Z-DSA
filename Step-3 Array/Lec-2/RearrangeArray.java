public class RearrangeArray {
    public static int[] solution(int[]arr){
        int m = arr.length;
        int []ans =new int[m];
        int p=0;
        int n=1;
        for(int i=0;i<m;i++){
            if(arr[i]<0){
                ans[n]=arr[i];
                n+=2;
            }else{
                ans[p]=arr[i];
                p+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr ={3,1,-2,-5,2,-4};
        int[]ans = solution(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"  ");
        }
    }
}
