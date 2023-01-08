import java.util.*;

public class IndianMoney {
    //Given infinite supply of denominations [1,2,5,10,50,100,200,500,2000]
    //For a Amount , find min number of coins/notes required.
    
    
    public static void main(String[] args) {
        int coins[] = {1,2,5,10,20,50,100,200,500,2000} ;
        int amt = 590;
        int coinsReq = getMinCoins(coins, amt );
        System.out.println("Min Coins Required: " + coinsReq);
    }

    private static int getMinCoins(int[] coins, int amt){
        Arrays.sort(coins);
        ArrayList<Integer> coinReq = new ArrayList<>();

        int count = 0;

        for(int i=coins.length-1;i>=0;i--){
            if(coins[i] <= amt){
                while(coins[i] <= amt){
                    count++;
                    coinReq.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }

        System.out.println(coinReq);

        return count;


    }
}
