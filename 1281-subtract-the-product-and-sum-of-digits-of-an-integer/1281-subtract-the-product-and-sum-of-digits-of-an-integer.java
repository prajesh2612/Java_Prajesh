class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,pro=1,d,n1=n;
        while(n1!=0)
        {
            d=n1%10;
            sum=sum+d;
            pro=pro*d;
            n1=n1/10;
        }
        int diff=pro-sum;
        return diff;
        
    }
}