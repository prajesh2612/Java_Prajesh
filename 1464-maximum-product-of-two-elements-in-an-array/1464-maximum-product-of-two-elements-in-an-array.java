class Solution {
    public static int getMax(List<Integer> list)
    {
        int max=Integer.MIN_VALUE;
        int l=list.size();
        int p=0;
        for(int i=0;i<l;i++)
        {
            if(max<list.get(i))
            {
                max=list.get(i);
                p=i;
            }
        }
        return p;
    }
    public int maxProduct(int[] nums) {
        // int maxP=Integer.MIN_VALUE;
        // int l=nums.length;
        // for(int i=0;i<(l-1);i++)
        // {
        //     for(int j=i+1;j<l;j++)
        //     {
        //         int pro=(nums[i]-1)*(nums[j]-1);
        //         if(maxP<pro)
        //         {
        //             maxP=pro;
        //         }
        //     }
        // }
        // return maxP;
        List<Integer> list=new ArrayList<>();
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            list.add(nums[i]);
        }        
        int maxP=getMax(list);
        int max1=list.get(maxP);
        list.remove(maxP);
        maxP=getMax(list);
        int max2=list.get(maxP);
        int maxPro=(max1-1)*(max2-1);
        return maxPro;
    }
}