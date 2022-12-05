class Solution {
    public List<Integer> majorityElement(int[] nums) {
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
        List<Integer> list=new ArrayList<>();
        for(int n:set)
        {
            if(hm.get(n)>l/3)
            {
                list.add(n);
            }
        }
        return list;
    }
}