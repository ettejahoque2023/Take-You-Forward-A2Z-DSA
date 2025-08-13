public class BuyStockAndSell {
    public static int solution (int [] arr){
        int buyPrice = Integer.MAX_VALUE;
        int profit ;
        int max_profit=0;
        for(int i=0;i<arr.length;i++){
            if(buyPrice < arr[i]){
                profit=arr[i]-buyPrice;
                max_profit= Math.max(profit,max_profit);
            }else{
                buyPrice=arr[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int []stock={7,1,5,3,6};
        System.out.println(solution(stock));
    }
}
