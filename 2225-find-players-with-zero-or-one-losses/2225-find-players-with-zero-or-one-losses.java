class Solution {
    public HashMap<Integer,Integer> add(int a,HashMap<Integer,Integer> hm)
    {
        if(hm.containsKey(a)==true)
        {
            int of=hm.get(a);
            int nf=of+1;
            hm.put(a,nf);
        }
        else
        {
            hm.put(a,1);
        }
        return hm;
    }
    public List<List<Integer>> findWinners(int[][] matches){
        int l=matches.length;
        HashMap<Integer,Integer> hlose=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<l;i++)
        {
            int a=matches[i][0];
            int b=matches[i][1];
            
            hs.add(matches[i][0]);
            hs.add(matches[i][1]);
            
            hlose=add(b,hlose);
        }
        
        List<List<Integer>> list=new ArrayList<>();
        TreeSet<Integer> ts1=new TreeSet<>();
        TreeSet<Integer> ts2=new TreeSet<>();
        for(int k:hs)
        {
            if((hlose.containsKey(k)==true)&&(hlose.get(k)==1))
            {
                ts2.add(k);
            }
            else if(hlose.containsKey(k)==false)
            {
                ts1.add(k);
            }
        }
        List<Integer> list1=new ArrayList<>(ts1);
        List<Integer> list2=new ArrayList<>(ts2);
        list.add(list1);
        list.add(list2);
        return list;
    }
}