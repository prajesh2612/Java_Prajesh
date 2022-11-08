class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hm=new HashMap<>();
        int l=nums.length;
        int arr[]=new int[2];
        for(int i=0;i<l;i++)
        {
            int diff=target-nums[i];
            if((hm.containsKey(diff)==true)&&(hm.get(diff)!=i))
            {
                arr[0]=i;
                arr[1]=hm.get(diff);
                break;
            }
            else
            {
                hm.put(nums[i],i);
            }
        }
//         int arr[]=new int[2];
//         for(int i=0;i<l;i++)
//         {
            
//         }
        return arr;
    }
}