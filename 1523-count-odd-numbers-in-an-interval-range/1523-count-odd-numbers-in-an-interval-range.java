class Solution {
    public int countOdds(int low, int high) {
        int c=0;
        if(((low%2!=0)&&(high%2!=0))||((low%2!=0)&&(high%2==0))||((low%2==0)&&(high%2!=0)))
        {
            c=((high-low)/2)+1;
        }
        else if((low%2==0)&&(high%2==0))
        {
            c=(high-low)/2;
        }
        return c;
    }
}