class Solution {
    public static int reverse(int n)
    {
        int n1=n,r=0;
        while(n1!=0)
        {
            int d=n1%10;
            r=r*10+d;
            n1=n1/10;
        }
        return r;
    }
    public boolean isSameAfterReversals(int num) {
        int rev1=reverse(num);
        int rev2=reverse(rev1);
        
        if(rev2==num)
        {
            return true;
        }
        return false;
    }
}