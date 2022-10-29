class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences)
        {
            String str2[]=s.split(" ");
            int l=str2.length;
            if(l>max)
            {
                max=l;
            }
        }
        return max;
    }
}