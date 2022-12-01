class Solution {
    public static int count(char c)
    {
        if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
        {
            return 1;
        }
        return 0;
    }
    public boolean halvesAreAlike(String s) {
        int l=s.length();
        s=s.toLowerCase();
        String s1=s.substring(0,l/2);
        String s2=s.substring(l/2);
        
        System.out.println(s1+" "+s2);
        int c1=0,c2=0;
        for(int i=0;i<l/2;i++)
        {
            char chr1=s1.charAt(i);
            char chr2=s2.charAt(i);
            
            c1=c1+count(chr1);
            c2=c2+count(chr2);
        }
        System.out.println(c1+" "+c2);
        if(c1==c2)
        {
            return true;
        }
        return false;   
    }
}