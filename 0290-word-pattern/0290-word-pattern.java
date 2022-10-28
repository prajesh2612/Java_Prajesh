class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[]=s.split(" ");
        int l1=arr.length;
        int l2=pattern.length();
        if(l1==l2)
        {
            HashMap<Character,String> hm=new HashMap<>();
        HashMap<String,Character> hm2=new HashMap<>();
        int c=0;
        for(String k:arr)
        {
            char chr=pattern.charAt(c);
            if(hm.containsKey(chr)==true)
            {
                String s1=hm.get(chr);
                if(s1.equals(k)==false)
                {
                    return false;
                }
            }
            else
            {
                hm.put(chr,k);
            }
            
            if(hm2.containsKey(k)==true)
            {
                char chr2=hm2.get(k);
                if(chr2!=chr)
                {
                    return false;
                }
            }
            else
            {
                hm2.put(k,chr);
            }
            c++;
        }
        return true;
        }
        return false;
    }
}