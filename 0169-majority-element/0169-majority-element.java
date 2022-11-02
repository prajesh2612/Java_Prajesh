class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length,k=0;
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(nums[i])==true)
            {
                int of=hm.get(nums[i]);
                int nf=of+1;
                hm.put(nums[i],nf);
            }
            else
            {
                hm.put(nums[i],1);
            }
            
            if(hm.get(nums[i])>(n/2))
            {
                k=nums[i];
                break;
            }
        }
        return k;        
    }
}