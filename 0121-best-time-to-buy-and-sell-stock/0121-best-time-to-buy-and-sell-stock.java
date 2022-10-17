class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=0,p=0,profit=0;
        int l=prices.length;
         for(int i=0;i<l;i++)
         {
             if(min>prices[i])
             {
                 min=prices[i];
             }
             profit=prices[i]-min;
             if(max<profit)
             {
                 max=profit;
             }             
         } 
        return max;
    }
}