class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm=new HashMap<>();
        int l=key.length();
        int j=97;
        for(int i=0;i<l;i++)
        {
            char chr=key.charAt(i);
            if((hm.containsKey(chr)==false)&&(chr!=' '))
            {
                hm.put(chr,((char)(j)));
                j++;
            }
        }
        hm.put(' ',' ');
        int l2=message.length();
        String str="";
        for(int i=0;i<l2;i++)
        {
            char chr=message.charAt(i);
            if(hm.containsKey(chr)==true)
            {
                str=str+hm.get(chr);
            }
        }
        return str;
    }
}