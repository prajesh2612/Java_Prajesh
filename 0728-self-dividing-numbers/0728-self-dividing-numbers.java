class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int n1=i;
            while(n1!=0)
            {
                int d=n1%10;
                if(d!=0)
                {
                    if(i%d!=0)
                    {
                        break;
                    }
                    else
                    {
                        n1=n1/10;
                    }
                }
                else
                {
                    break;
                }
            }
            if(n1==0)
            {
                list.add(i);
            }
        }
        return list;
    }
}