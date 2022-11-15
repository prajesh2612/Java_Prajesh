class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE,c=0;
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==1)
            {
                c++;
            }
            else
            {
                if(c>max)
                {
                    max=c;
                }
                c=0;
            }
        }
        if(c>max)
        {
            max=c;
        }
        return max;        
    }
}