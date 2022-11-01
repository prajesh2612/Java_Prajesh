class Solution {
    public static String reverse(String s)
    {
        int l=s.length();
        String rev="";
        for(int i=0;i<l;i++)
        {
            char chr=s.charAt(i);
            rev=chr+rev;
        }
        return rev;
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char chr=s.charAt(i);
            if((Character.isLetter(chr)==true)||(Character.isDigit(chr)==true))
            {
                str=str+chr;
            }
        }
        String rev=reverse(str);
        if(rev.equals(str)==true)
        {
            return true;
        }
        
        return false;
        
    }
}