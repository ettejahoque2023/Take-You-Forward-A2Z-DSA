public class Palindrome {
    public static boolean func(int num){
        int temp = num;
        int x=0;
        while(num>0){
            int rem = num %10;
            x= x*10 + rem;
            num = num/10;
        }
       if(x == temp){
        return true;
       }else{
        return false;
       }
    }
    public static void main(String[] args) {
        int num = 123;
        System.out.println(func(num));
    }
}
