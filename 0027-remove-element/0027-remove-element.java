class Solution {
    public int removeElement(int[] nums, int val) {
        int l=nums.length;
        int c=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<l;i++)
        {
            if(nums[i]!=val)
            {
                st.push(nums[i]);
            }
        }
        int s1=st.size();
        for(int i=(s1-1);i>=0;i--)
        {
            nums[i]=st.pop();
        }
        return s1;
    }
}