class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list=new ArrayList<>();
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            list.add(index[i],nums[i]);
        }
        int arr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}