class Solution {
    public String makeGood(String s) {
        int l=s.length();
        int i=0;
        Stack<Character> st=new Stack<>();
        while(i<l)
        {
            char chr1=s.charAt(i);
            if(st.size()>=2)
            {
                char b=st.pop();
                char a=st.pop();
                if((int)(Math.abs(a-b))!=32)
                {
                    st.push(a);
                    st.push(b);
                }
            }
            st.push(chr1);
            System.out.println(st);
            i++;
        }
        int s1=st.size();
        String str="";
        for(int j=0;j<s1;j++)
        {
            str=st.pop()+str;
        }
        int l2=str.length();
        if((str.length()>=2)&&((int)(Math.abs(str.charAt(l2-2)-str.charAt(l2-1)))==32))
        {
            str=str.substring(0,l2-2);
        }      
        
        return str;
    }
}