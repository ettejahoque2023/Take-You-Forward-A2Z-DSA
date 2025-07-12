public class FibonacciNumber {
    public static int func(int n){
        if(n <= 1){
            return n;
        }

        int f1 = func(n-1);
        int f2 = func(n-2);
        int f= f1+f2;
        return  f;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(func(n)+" ");
    }
}
