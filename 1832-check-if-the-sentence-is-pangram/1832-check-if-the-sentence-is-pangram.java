class Solution {
    public boolean checkIfPangram(String sentence) {
        int l=sentence.length();
        if(l<26)
        {
            return false;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<l;i++)
        {
            char chr=sentence.charAt(i);
            if(hm.containsKey(chr)==true)
            {
                int of=hm.get(chr);
                int nf=of+1;
                hm.put(chr,nf);
            }
            else
            {
                hm.put(chr,1);
            }
        }
        for(int i=97;i<=122;i++)
        {
            if(hm.containsKey((char)i)==false)
            {
                return false;
            }
        }
        return true;
    }
}