public class Armstrong {
      public static boolean func(int num){
        int temp = num;
        int x=0;
        while(num>0){
            int rem = num %10;
            x= x + (rem * rem * rem) ;
            num = num/10;
        }
        if( x==temp){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n =153;
        System.out.println(func(n));
    }
}
