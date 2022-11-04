class Solution {
    public static boolean isVowel(char c)
    {
        if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int l=s.length();
        StringBuilder sb=new StringBuilder(s);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<l;i++)
        {
            char chr=s.charAt(i);
            if(isVowel(chr)==true)
            {
                list.add(i);
            }
        }
        int s1=list.size();
        int i=0,j=s1-1;
       while(i<=j)
       {
           int a=list.get(i);
           int b=list.get(j);
           sb.setCharAt(a,s.charAt(b));
           sb.setCharAt(b,s.charAt(a));
           
           i++;
           j--;
       }        
        return sb.toString();
        
    }
}