public class FactorialOfN {
    public  static  int func(int n){
        if(n==0){
            return 1;
        }
    
        int fact= n* func(n-1);
        return fact;
    }
    public static void main (String args[]){
        int n = 5;
        System.out.println(func(n));
    }
}
