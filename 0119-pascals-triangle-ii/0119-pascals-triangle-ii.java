class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer> list2=new ArrayList<Integer>();
            for(int j=0;j<i+1;j++)
            {
                if((j==0)||(j==i))
                {
                    list2.add(1);
                }
                else
                {
                    list2.add((list.get(i-1).get(j-1))+(list.get(i-1).get(j)));
                }
            }
            list.add(list2);
        }
        return list.get(rowIndex);
    }
}