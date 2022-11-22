class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)
        {
            return false;
        }
        int sum=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                int a=num/i;
                if((hs.contains(a)||(hs.contains(i))))
                {
                    break;
                }
                else
                {
                    hs.add(a);
                    hs.add(i);
                }
            }
        }
        System.out.println(hs);
        for(int n:hs)
        {
            sum=sum+n;
        }
        sum=sum+1;
        if(sum==num)
        {
            return true;
        }
        return false;
    }
}