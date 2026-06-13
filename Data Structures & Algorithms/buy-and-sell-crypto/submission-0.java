class Solution {
    public int maxProfit(int[] prices) {
        int lowestbuy = 100;
        int highestsell = 0;

        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i]<lowestbuy){lowestbuy=prices[i];}
            if(prices[i]-lowestbuy > highestsell){highestsell=prices[i]-lowestbuy;}
        }
        return highestsell;
    }
}
