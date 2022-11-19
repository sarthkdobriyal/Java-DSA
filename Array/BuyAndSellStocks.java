package Array;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int  prices[] = {7, 6, 4,  3, 1};

        int minsf = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        int currProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < minsf){
                minsf = prices[i];
            }
            currProfit = prices[i] - minsf;

            if(currProfit > maxProfit){
                maxProfit =currProfit;
            }
        }

        System.out.println(maxProfit);

    }
}
