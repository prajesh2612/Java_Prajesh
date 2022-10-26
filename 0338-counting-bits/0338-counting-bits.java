class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        for(int i=0;i<(n+1);i++)
        {
            int n1=i,c=0;
            while(n1!=0)
            {
                int d=n1%2;
                if(d==1)
                {
                    c++;
                }
                n1=n1/2;
            }
            a[i]=c;
        }
        return a;
    }
}