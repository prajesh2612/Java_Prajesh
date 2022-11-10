class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        int l=s.length();
        int i=0;
        while(i<l)
        {
            char chr=s.charAt(i);
            if(st.size()>=2)
            {
                char chr2=st.pop();
                char chr1=st.pop();
                if(chr1!=chr2)
                {
                    st.push(chr1);
                    st.push(chr2);
                }
            }
            st.push(chr);
            i++;
        }
        int s1=st.size();
        String str="";
        for(int j=0;j<s1;j++)
        {
            str=st.pop()+str;
        }
        if((s1>=2)&&(str.charAt(s1-1)==str.charAt(s1-2)))
        {
            str=str.substring(0,s1-2);
        }
        return str;        
    }
}