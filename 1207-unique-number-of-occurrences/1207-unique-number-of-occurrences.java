class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            if(hm.containsKey(arr[i])==true)
            {
                int of=hm.get(arr[i]);
                int nf=of+1;
                hm.put(arr[i],nf);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        System.out.println(hm);
        Set<Integer> set=hm.keySet();
        HashSet<Integer> hs=new HashSet<>();
        for(int k:set)
        {
            if(hs.contains(hm.get(k))==true)
            {
                return false;
            }
            else
            {
                hs.add(hm.get(k));
            }
        }
        return true;
    }
}