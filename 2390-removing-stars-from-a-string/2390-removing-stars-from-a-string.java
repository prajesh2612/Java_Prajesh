class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        int l=s.length();
        int i=0;
        while(i!=l)
        {
            char chr=s.charAt(i);
            if(st.size()>=2)
            {
                if(st.peek()=='*')
                {
                    st.pop();
                    st.pop();
                }
            }
            st.push(chr);
            i++;
        }
        if((st.peek()=='*')&&(st.size()>=2))
        {
            st.pop();
            st.pop();
        }
        int s1=st.size();
        String str="";
        StringBuilder sb=new StringBuilder(str);
        for(int j=0;j<s1;j++)
        {
            sb.append(st.pop());
        }
        StringBuilder rev=sb.reverse();
        return (rev.toString());
    }
}