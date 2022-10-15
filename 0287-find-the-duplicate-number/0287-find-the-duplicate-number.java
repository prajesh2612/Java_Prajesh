class Solution {
    public int findDuplicate(int[] nums) {
        // int n=nums.length;
        // int p=0;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(j!=i)
        //         {
        //             if(nums[i]==nums[j])
        //             {
        //                 p=nums[i];
        //                 break;
        //             }
        //         }
        //     }
        // }
        // return p;
        
        int l=nums.length;
        int p=0;
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<l;i++)
        {
            if(hp.containsKey(nums[i])==true)
            {
                p=nums[i];
                break;
            }
            else
            {
                hp.put(nums[i],1);
            }
        }
        return p;
    }
}