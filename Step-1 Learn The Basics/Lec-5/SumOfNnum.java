public class SumOfNnum {
    public static void func(int sum,int i){
        if(i<1){
            System.out.println(sum);
            return;  
        }
        func(sum+i,i-1);
    }
    public static void main(String[] args) {
        int n =10;
        func(0,n);
    }
}
