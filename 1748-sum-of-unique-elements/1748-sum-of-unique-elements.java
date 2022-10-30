class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0,p=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=nums.length;
        for(int i=0;i<l;i++)
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
        }
        Set<Integer> set=hm.keySet();
        for(int k:set)
        {
            if(hm.get(k)==1)
            {
                sum=sum+k;
            }
        }
        return sum;
    }
}