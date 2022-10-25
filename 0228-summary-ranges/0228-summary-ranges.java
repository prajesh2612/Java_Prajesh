class Solution {
    public List<String> summaryRanges(int[] nums) {
        int l=nums.length;
        List<String> list=new ArrayList<>();
        if(l!=0)
        {
            int s=nums.length,start=0,end=0,i,j;
        String str="";
        
        for(i=0,j=1;i<s-1 && j<s;i++,j++)
        {
            if(nums[j]-nums[i]==1)
            {
                if(i<start)
                {
                    start=i;
                }
            }
            else
            {
                end=j-1;
                if(start==end)
                {
                    str=String.valueOf(nums[start]);
                }
                else
                {
                    str=String.valueOf(nums[start])+"->"+String.valueOf(nums[end]);
                }
                list.add(str);
                start=j;
            }
        }
        if(start!=(j-1))
        {
            str=String.valueOf(nums[start])+"->"+String.valueOf(nums[j-1]);
        }
        else
        {
            str=String.valueOf(nums[start]);
        }
        list.add(str);
        }
        
        return list;
    }
}