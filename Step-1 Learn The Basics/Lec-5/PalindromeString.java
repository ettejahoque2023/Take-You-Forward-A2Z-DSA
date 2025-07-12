public class PalindromeString {
    public static boolean  func(int i,String str){
        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
        return func(i+1,str);
    }
    public static void main(String[] args) {
        String str = "bob";
        System.out.println(func(0, str));
    }
}
