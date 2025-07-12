public class PrintNtimes {
    public static void func(int n){
        if(n==0){
            return;
        }
        System.out.println("It'z Nituu here.........");
        func(n-1);
    }
    public static void main(String[] args) {
        int n =10;
        func(n);
    }
}
