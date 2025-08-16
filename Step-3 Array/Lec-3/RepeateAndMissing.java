public class RepeateAndMissing {
    public static int[] solution(int[]a){
        long n = a.length;
        long sn= (n*(n+1)/2);
        long s2n=(n* (n+1) * (2*n + 1))/6;
        long s1=0;
        long s2=0;
        for(int i=0;i<n;i++){
            s1+=a[i];
            s2+=a[i] * a[i];
        }

        long v1= s1-sn;
        long v2 = s2-s2n;
        v2=v2/v1;
        long x=(v1 + v2)/2;
        long y = x-v1;
        int ans []={(int)x,(int)y};
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int ans []=solution(a);
        System.out.println("The repeating and missing numbers are: {"+ ans[0] + ", " + ans[1] + "}");
    }
}
