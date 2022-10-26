class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // int l=nums.length;
        // for(int i=2;i<=l;i++)
        // {
        //     int sum=0;
        //     for(int j=0;j<i;j++)
        //     {
        //         sum=sum+nums[j];
        //     }
        //     if(sum%k==0)
        //     {
        //         return true;
        //     }
        //     int p=0;
        //     for(int j=i;j<l;j++)
        //     {
        //         sum=sum-nums[p]+nums[j];
        //         if(sum%k==0)
        //         {
        //             return true;
        //         }
        //         p=p+1;
        //     }
        // }
        // return false;
        
         // maintain a hash map to store <sum % k, index>
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k; 
            // case 1
            if (sum == 0 && i > 0) {
                return true;
            }
            // case 2
            if (map.containsKey(sum) && i - map.get(sum) > 1) { 
                return true;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i); 
            }
            
        }
        return false;
    }
}