class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hs=new HashSet<>();
        int sum=0;
        while(hs.add(n))
        {
            int n1=n;
            sum=0;
            while(n1!=0)
            {
                int d=n1%10;
                sum=sum+(d*d);
                n1=n1/10;
            }
            if(sum==1)
            {
                return true;
            }
            n=sum;
        }
        return false;        
    }
}