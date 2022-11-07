class Solution {
    public int maximum69Number (int num) {
        int max=num;
        String str=String.valueOf(num);
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            StringBuilder sb=new StringBuilder(str);
            char chr=str.charAt(i);
            if(chr=='6')
            {
                sb.setCharAt(i,'9');
            }
            else if(chr=='9')
            {
                sb.setCharAt(i,'6');
            }
            int num2=Integer.parseInt(sb.toString());
            if(num2>max)
            {
                max=num2;
            }
        }
        return max;        
    }
}