class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("type",0);
        hm.put("color",1);
        hm.put("name",2);
        int c=0;
        int s=items.size();
        int a=hm.get(ruleKey);
        for(int i=0;i<s;i++)
        {
            String str=items.get(i).get(a);
            if(str.equals(ruleValue)==true)
            {
                c++;
            }
        }
        return c;
    }
}