class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<l1;i++)
        {
            char chr=s1.charAt(i);
            if(hm1.containsKey(chr)==true)
            {
                int of=hm1.get(chr);
                int nf=of+1;
                hm1.put(chr,nf);
            }
            else
            {
                hm1.put(chr,1);
            }
        }
        if(l2>=l1)
        {
            String str="";
            HashMap<Character,Integer> hm2=new HashMap<>();
            StringBuilder sb=new StringBuilder("");
            for(int i=0;i<l1;i++)
            {
                char chr=s2.charAt(i);
                sb.append(chr);
                if(hm2.containsKey(chr)==true)
                {
                    int of=hm2.get(chr);
                    int nf=of+1;
                    hm2.put(chr,nf);
                }
                else
                {
                    hm2.put(chr,1);
                }
            }
            if(hm1.equals(hm2)==true)
            {
                return true;
            }
            for(int i=l1;i<l2;i++)
            {
                int of1=hm2.get(sb.charAt(0));
                int nf1=of1-1;
                if(nf1==0)
                {
                    hm2.remove(sb.charAt(0));
                }
                else
                {
                    hm2.put(sb.charAt(0),nf1);
                }
                sb.deleteCharAt(0);
                char chr=s2.charAt(i);
                sb.append(chr);
                if(hm2.containsKey(chr)==true)
                {
                    int of=hm2.get(chr);
                    int nf=of+1;
                    hm2.put(chr,nf);
                }
                else
                {
                    hm2.put(chr,1);
                }
                if(hm2.equals(hm1)==true)
                {
                    return true;
                }
            }           
        }
        return false;
    }
}