class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char chr1=s.charAt(i);
            char chr2=t.charAt(i);
            
            if(hm.containsKey(chr1)==true)
            {
                if(hm.get(chr1)!=chr2)
                {
                    return false;
                }
            }
            else
            {
                if(hm.containsValue(chr2)==true)
                {
                    return false;
                }
                hm.put(chr1,chr2);
            }
        }
        return true;
        
    }
}