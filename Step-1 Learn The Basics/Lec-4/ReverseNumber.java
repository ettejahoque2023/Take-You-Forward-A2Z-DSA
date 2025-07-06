public class ReverseNumber {
    public static int func(int num){
        int n =0;
        while(num>0){
            int r= num %10;
            n = n*10+r;
            num = num/10;
        }
        return n;
    }
    public static void main(String[] args) {
        int num =198054;
        System.out.println(func(num));
    }
}
