class Solution {
    public String sortSentence(String s) {
        HashMap<Integer,String> hm=new HashMap<>();
        s=s+" ";
        int l=s.length();
        int j=-1,c=0;
        for(int i=0;i<l;i++)
        {
            char chr=s.charAt(i);
            if(chr==' ')
            {
                c=c+1;
                char chr2=s.charAt(i-1);
                int a=((int)(chr2))-48;
                String str=s.substring((j+1),i-1);
                hm.put(a,str);
                j=i;
            }
        }
        String result="";
        for(int i=1;i<=c;i++)
        {
            if(hm.containsKey(i)==true)
            {
                result=result+" "+hm.get(i);
            }
        }
        return result.substring(1);        
    }
}