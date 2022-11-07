class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l=nums1.length;
        for(int i=0;i<l;i++)
        {
            Stack<Integer> st=new Stack<>();
            int l2=nums2.length;
            for(int j=(l2-1);j>=0;j--)
            {
                if(nums2[j]!=nums1[i])
                {
                    st.push(nums2[j]);
                }
                else
                {
                    break;
                }
            }
            int s=st.size();
            while(s>0)
            {
                int a=st.pop();
                if((a>nums1[i])&&(s>=0))
                {
                    nums1[i]=a;
                    break;
                }
                s--;
            }
            if(s==0)
            {
                nums1[i]=-1;
            }
        }
        return nums1;
    }
}