class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l1=p.length();
        int l2=s.length();
        List<Integer> list=new ArrayList<>();
        int c=0;
        if(l2>=l1)
        {
            HashMap<Character,Integer> hm1=new HashMap<>();
            for(int i=0;i<l1;i++)
            {
                char chr=p.charAt(i);
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
            HashMap<Character,Integer> hm2=new HashMap<>();
            StringBuilder sb=new StringBuilder("");
            for(int i=0;i<l1;i++)
            {
                char chr=s.charAt(i);
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
                c++;
            }
            if(hm1.equals(hm2)==true)
            {
                list.add(c+-l1);
            }
            for(int i=l1;i<l2;i++)
            {
                if(hm2.containsKey(sb.charAt(0))==true)
                {
                    int of=hm2.get(sb.charAt(0));
                    int nf=of-1;
                    if(nf==0)
                    {
                        hm2.remove(sb.charAt(0));
                    }
                    else
                    {
                        hm2.put(sb.charAt(0),nf);
                    }
                }
                sb.deleteCharAt(0);
                char chr=s.charAt(i);
                sb.append(chr);
                if(hm2.containsKey(chr)==true)
                {
                    int of1=hm2.get(chr);
                    int nf1=of1+1;
                    hm2.put(chr,nf1);
                }
                else
                {
                    hm2.put(chr,1);
                }
                if(hm1.equals(hm2)==true)
                {
                    list.add((i+1)-l1);
                }
            }
        }
        return list;        
    }
}