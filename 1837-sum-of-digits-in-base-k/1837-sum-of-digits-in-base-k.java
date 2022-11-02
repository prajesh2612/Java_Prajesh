class Solution {
    public int sumBase(int n, int k) {
        int n1=n,sum=0;
        while(n1!=0)
        {
            int d=n1%k;
            sum=sum+d;
            n1=n1/k;
        }
        return sum;        
    }
}