class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hs=new HashSet<>();//this hashset is used to store the sums of the digits in each iteration. As soon as the already exisiting sum in the hashset get added, that means there is a cycle and hence the number isn't a happy number
        
        while(n!=1)
        {
            int n1=n,sum=0;
            while(n1!=0)
            {
                int d=n1%10;
                sum=sum+(d*d);
                n1=n1/10;
            }
            if(hs.contains(sum))
            {
                return false;
            }
            hs.add(sum);
            n=sum;
        }
        return true;        
    }
}