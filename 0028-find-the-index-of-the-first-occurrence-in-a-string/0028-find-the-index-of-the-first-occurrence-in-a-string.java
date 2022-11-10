class Solution {
    public int strStr(String haystack, String needle) {
        int l1=needle.length();
        int l2=haystack.length();
        if(l2<l1)
        {
            return -1;
        }
        StringBuilder sb=new StringBuilder("");
        int p=0;
        for(int i=0;i<l1;i++)
        {
            sb.append(haystack.charAt(i));
            p++;
        }
        if((sb.toString()).equals(needle)==true)
        {
            return (p-l1);
        }
        for(int i=l1;i<l2;i++)
        {
            char chr=haystack.charAt(i);
            sb.deleteCharAt(0);
            sb.append(chr);
            if((sb.toString()).equals(needle)==true)
            {
                return (i+1-l1);
            }
        }
       
        return -1;
    }
}