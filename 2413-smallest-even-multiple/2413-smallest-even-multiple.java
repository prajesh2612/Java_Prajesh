class Solution {
    public int smallestEvenMultiple(int n) {
        int p=0;
        if(n!=1)
        {
            for(int i=1;i<=n;i++)
            {
                p=n*i;
                if(p%2==0)
                {
                    break;                
                }
            }
        }
        else
        {
            p=2;
        }
        return p;
    }
}