class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char chr=s.charAt(i);
            if(st.size()==0)
            {
                st.push(chr);
            }
            else if(((st.peek()=='(')&&(chr==')'))||((st.peek()=='{')&&(chr=='}'))||((st.peek()=='[')&&(chr==']')))
            {
                st.pop();
            }
            else
            {
                st.push(chr);
            }
        }
        if(st.size()==0)
        {
            return true;
        }
        return false;
    }
}