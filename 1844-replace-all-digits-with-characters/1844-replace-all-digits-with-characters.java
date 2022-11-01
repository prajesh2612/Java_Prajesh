class Solution {
    public static char shift(char ch,int d)
    {
        int a=(int)ch;
        int b=a+d;
        return ((char)b);
    }
    public String replaceDigits(String s) {
        int l=s.length();
        StringBuilder sb=new StringBuilder(s);
        for(int i=1;i<l;i=i+2)
        {
            char chr=s.charAt(i);
            char chr1=s.charAt(i-1);
            char chr2=shift(chr1,(((int)chr)-48));
            sb.setCharAt(i,chr2);        
        }      
        return sb.toString();
        
    }
}