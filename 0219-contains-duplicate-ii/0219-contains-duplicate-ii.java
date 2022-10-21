class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean f=false;
        int i=0,n=1;
        int l=nums.length;
        while(n<=k)
        {
            for(int j=n;j<l;j++)
            {
                if(nums[i]==nums[j])
                {
                    f=true;
                    break;
                }
                i++;
            }
            if(f==true)
            {
                break;
            }
        n++;
        i=0;
        }
    return f;
    }
}
