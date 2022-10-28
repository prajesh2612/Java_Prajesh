class Solution {
    public int maxProduct(int[] nums) {
        int maxP=Integer.MIN_VALUE;
        int l=nums.length;
        for(int i=0;i<(l-1);i++)
        {
            for(int j=i+1;j<l;j++)
            {
                int pro=(nums[i]-1)*(nums[j]-1);
                if(maxP<pro)
                {
                    maxP=pro;
                }
            }
        }
        return maxP;
    }
}