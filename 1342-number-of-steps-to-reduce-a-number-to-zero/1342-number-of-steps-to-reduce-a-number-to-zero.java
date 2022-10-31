class Solution {
    public int numberOfSteps(int num) {
        int n1=num,c=0;
        while(n1!=0)
        {
            if(n1%2==0)
            {
                n1=n1/2;
            }
            else
            {
                n1=n1-1;
            }
            c++;
        }
        return c;
    }
}