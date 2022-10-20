class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();
        
        int l1=list1.length;
        for(int i=0;i<l1;i++){map.put(list1[i],i);};
        
        int l2=list2.length;
        List<String> list=new ArrayList<>();
        int sum=0,min=Integer.MAX_VALUE;
        for(int i=0;i<l2;i++)
        {
            Integer j=map.get(list2[i]);
            if((j!=null)&&(map.containsKey(list2[i])==true))
            {
                sum=map.get(list2[i])+i;
                if(min>sum)
                {
                    list.clear();
                    min=sum;
                    list.add(list2[i]);
                }
                else if(min==sum)
                {
                    list.add(list2[i]);
                }
            }
        }     
        return list.toArray(new String[list.size()]);
        
    }
}