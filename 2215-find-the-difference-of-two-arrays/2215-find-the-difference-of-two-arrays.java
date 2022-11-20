class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        List<Integer> list1=new ArrayList<>(len1);
        List<Integer> list2=new ArrayList<>(len2);
        for(int i=0;i<len1;i++){list1.add(nums1[i]);}
        for(int i=0;i<len2;i++){list2.add(nums2[i]);}
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int i=0;i<len1;i++)
        {
            if(list2.contains(nums1[i])==false)
            {
                hs1.add(nums1[i]);
            }
        }

        List<Integer> l1=new ArrayList<>();
        for(int k1:hs1){l1.add(k1);}
        
        for(int i=0;i<len2;i++)
        {
            if(list1.contains(nums2[i])==false)
            {
                hs2.add(nums2[i]);
            }
        }
        List<Integer> l2=new ArrayList<>();
        for(int k2:hs2){l2.add(k2);}
        
        List<List<Integer>> result=new ArrayList<>();
        result.add(l1);
        result.add(l2);
        return result;
    }
}