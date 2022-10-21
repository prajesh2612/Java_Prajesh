class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // int l=nums.length;
        // for(int i=0;i<l;i++)
        // {
        //     if(hm.containsKey(nums[i])==true)
        //     {
        //         int of=hm.get(nums[i]);
        //         int nf=of+1;
        //         hm.put(nums[i],nf);
        //     }
        //     else
        //     {
        //         hm.put(nums[i],1);
        //     }
        // }
        // Set<Integer> set=hm.keySet();
        // for(int i:set)
        // {
        //     if(hm.get(i)==1)
        //     {
        //         return i;
        //     }
        // }
        // return 0;
        
        
        //use the concept of xor
        int result=0;
        for(int i:nums)
        {
            result^=i;
        }
        return result;
        
    }
}