class Solution {
    public boolean isAnagram(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        if(l1==l2)
        {
            HashMap<Character,Integer> hm1=new HashMap<>();
            HashMap<Character,Integer> hm2=new HashMap<>();
            for(int i=0;i<l1;i++)
            {
                char chr1=s.charAt(i);
                char chr2=t.charAt(i);
                if(hm1.containsKey(chr1)==true)
                {
                    int of=hm1.get(chr1);
                    int nf=of+1;
                    hm1.put(chr1,nf);
                }
                else
                {
                    hm1.put(chr1,1);
                }
                
                if(hm2.containsKey(chr2)==true)
                {
                    int of=hm2.get(chr2);
                    int nf=of+1;
                    hm2.put(chr2,nf);
                }
                else
                {
                    hm2.put(chr2,1);
                }
            }
            if(hm1.equals(hm2)==true)
            {
                return true;
            }
        }
        return false;
    }
}