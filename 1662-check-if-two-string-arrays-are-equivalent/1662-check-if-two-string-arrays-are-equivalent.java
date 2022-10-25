class Solution {
    public static String stringAdd(String arr[])
    {
        String str="";
        StringBuilder sb=new StringBuilder(str);
        for(String s:arr)
        {
            sb.append(s);
        }
        str=sb.toString();
        return str;
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1=stringAdd(word1);
        String str2=stringAdd(word2);
        if(str1.equals(str2))
        {
            return true;
        }
        return false;
    }
}