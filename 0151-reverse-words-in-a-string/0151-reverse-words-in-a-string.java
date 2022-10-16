class Solution {
    public String reverseWords(String s) {
        // s=s+" ";
        // int l=s.length();
        // String wd="",str="";;
        // for(int i=0;i<l;i++)
        // {
        //     char chr=s.charAt(i);
        //     if(chr!=' ')
        //     {
        //         wd=wd+chr;
        //     }
        //     else
        //     {
        //         str=wd+" "+str;
        //         wd="";
        //     }            
        // }
        // str=str.substring(0,l-1);
        // return str;
        
        String arr[]=s.split(" ");
        String str="";
        for(String k:arr)
        {
            int l2=k.length();
            if(l2!=0)
            {
                str=k+" "+str;
            }
        }
        int l=str.length();
        str=str.substring(0,l-1);
        return str;
        
    }
}