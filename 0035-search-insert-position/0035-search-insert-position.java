class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length;
        int lb=0,ub=l-1,p=0,k=0;
        while(lb<=ub)
        {
            p=(ub+lb)/2;
            if(nums[p]<target)
            {
                lb=p+1;
            }
            else if(nums[p]>target)
            {
                ub=p-1;
            }
            else if(nums[p]==target)
            {
                k=1;
                break;
            }
        }
        if(k==1)
        {
            return p;
        }
       
        int m=0;
        while((m<l)&&(nums[m]<target))
        {
            m++;
        }       
        return m;
        
    }
}