class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
        int k=0;
        for(int i=0;i<l-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        nums[k]=nums[l-1];
        k++;
        return k;
    }
}