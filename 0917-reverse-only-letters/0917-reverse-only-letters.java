class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder("");
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char chr=s.charAt(i);
            if(Character.isLetter(chr)==true)
            {
                sb.append(chr);
            }
        }
        int c=sb.length()-1;
        StringBuilder sb1=new StringBuilder("");
        for(int i=0;i<l;i++)
        {
            char chr=s.charAt(i);
            if(Character.isLetter(chr)==false)
            {
                sb1.append(chr);
            }
            else
            {
                char chr2=sb.charAt(c);
                sb1.append(chr2);
                c--;
            }
        }
        return sb1.toString();
    }
}