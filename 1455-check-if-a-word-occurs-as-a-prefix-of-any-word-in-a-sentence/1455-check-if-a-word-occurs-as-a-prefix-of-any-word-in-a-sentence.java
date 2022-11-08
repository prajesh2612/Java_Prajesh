class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int l1=searchWord.length();
        int c=1;
        String arr[]=sentence.split(" ");
        for(String s:arr)
        {
            int l2=s.length();
            if(l2>=l1)
            {
                String wd=s.substring(0,l1);
                if((wd.toLowerCase()).equals(searchWord.toLowerCase())==true)
                {
                    System.out.println(wd+" "+s);
                    return c;
                }                
            }
            c++;
        }
        return -1;
    }
}