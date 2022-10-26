public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String str=Integer.toBinaryString(n);
        int l=str.length(),c=0;
        for(int i=0;i<l;i++)
        {
            char chr=str.charAt(i);
            if(chr=='1')
            {
                c++;
            }
        }
        return c;
    }
}