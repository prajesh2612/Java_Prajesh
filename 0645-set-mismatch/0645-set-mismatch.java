class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int a[]=new int[2];
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(hm.containsKey(nums[i])==true)
            {
                a[0]=nums[i];
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        for(int i=1;i<=l;i++)
        {
            if(hm.containsKey(i)==false)
            {
                a[1]=i;
                break;
            }
        }
        return a;
        
    }
}