class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<l2;i++)
        {
            list2.add(nums2[i]);
        }
        for(int i=0;i<l1;i++)
        {
            if(list2.contains(nums1[i])==true)
            {
                hs.add(nums1[i]);
            }
        }
        int s1=hs.size();
        int arr[]=new int[s1];
        int k=0;
        for(int n:hs)
        {
            arr[k]=n;
            k++;
        }
        return arr;
    }
}