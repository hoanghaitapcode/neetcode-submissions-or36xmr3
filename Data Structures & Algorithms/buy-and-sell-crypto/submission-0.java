class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int left =0;
        for(int right=1;right<prices.length;right++){
            if(prices[left]<prices[right]){
                int currentProfit = prices[right]-prices[left];
                max= Math.max(max,currentProfit);
            }else{
                left=right;
            }
        }
        return max;
    }
}
