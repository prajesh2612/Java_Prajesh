class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int nums2[]=new int[l];
        for(int i=0;i<l;i++)
        {
            nums2[i]=nums[i];
        }     
        Arrays.sort(nums2);
        for(int i=0;i<l;i++)
        {
           if(hm.containsKey(nums2[i])==false)
           {
               hm.put(nums2[i],i);
           }
        }
        for(int i=0;i<l;i++)
        {
            nums2[i]=hm.get(nums[i]);
        }
        return nums2;
    }
}