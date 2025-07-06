public class CountDigits {
    public static  int func(int num){
        int n =0;
        while(num >0){
            num=num/10;
            n++;
        }
        return n;
    }
    public static void main(String[] args) {
        int num =99999;
       System.out.println(func(num));
    }
}
