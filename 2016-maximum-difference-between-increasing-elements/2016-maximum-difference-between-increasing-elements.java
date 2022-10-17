class Solution {
    public int maximumDifference(int[] nums) {
        int max=0,min=Integer.MAX_VALUE,diff=0,p=0;
        //int l=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
            }
            diff=nums[i]-min;
            if(diff>max)
            {
                max=diff;
                p=i;
            }
        }
        if((max==0)&&(p==0))
        {
            max=-1;
        }
        return max;        
    }
}