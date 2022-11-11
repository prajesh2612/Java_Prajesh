class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int k=0,c=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]!=0)
            {
                nums[k]=nums[i];
                k++;
            }
            else
            {
                c++;
            }
        }
        for(int i=k;i<(k+c);i++)
        {
            nums[i]=0;
        }        
    }
}