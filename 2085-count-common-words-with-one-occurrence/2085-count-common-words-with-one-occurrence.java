class Solution {
    public static HashMap<String,Integer> hashing(String words[])
    {
        HashMap<String,Integer> hm=new HashMap<>();
        int l=words.length;
        for(int i=0;i<l;i++)
        {
            if(hm.containsKey(words[i])==true)
            {
                int of=hm.get(words[i]);
                int nf=of+1;
                hm.put(words[i],nf);
            }
            else
            {
                hm.put(words[i],1);
            }
        }
        return hm;
    }
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hm1=new HashMap<>();
        HashMap<String,Integer> hm2=new HashMap<>();
        int c=0;
        
        hm1=hashing(words1);
        hm2=hashing(words2);
        
        Set<String> set=hm1.keySet();
        for(String s:set)
        {
            if(hm2.containsKey(s)==true)
            {
                if((hm1.get(s)==1)&&(hm2.get(s)==1))
                {
                    c++;
                }
            }
        }
        return c;        
    }
}