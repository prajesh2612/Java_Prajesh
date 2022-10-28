class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int t1=0;
        String t2="";
        int l=names.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-1-i;j++)
            {
                if(heights[j]<heights[j+1])
                {
                    t1=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=t1;
                    
                    t2=names[j];
                    names[j]=names[j+1];
                    names[j+1]=t2;
                }
            }
        }
        return names;
        
    }
}