class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int l=nums.length;
        // int s=0,k=0;
        // int a[]=new int[2];
        // for(int i=0;i<l;i++)
        // {
        //     for(int j=i+1;j<l;j++)
        //     {
        //         s=nums[i]+nums[j];
        //         if(s==target)
        //         {
        //             k=1;
        //             a[0]=i;
        //             a[1]=j;
        //             break;
        //         }
        //     }
        //     if(k==1)
        //     {
        //         break;
        //     }
        // }
        // return(a);    
        
         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int arr[] = new int[2];
        for(int i = 0 ;i<nums.length; i++)
        {
            if(map.containsKey(target - nums[i]))
            {
              arr[0] = i;
              arr[1] = map.get(target - nums[i]); 
                break;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}