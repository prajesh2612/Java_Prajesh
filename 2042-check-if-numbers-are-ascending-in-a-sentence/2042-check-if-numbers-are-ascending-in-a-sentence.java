class Solution {
    public boolean isNumber(String n)
    {
        try
        {
            int a=Integer.parseInt(n);
        }
        catch(Exception E)
        {
            return false;
        }
        return true;
    }
    public boolean areNumbersAscending(String s) {
        String arr[]=s.split(" ");
        int max=0;
        for(String k:arr)
        {
           if(isNumber(k)==true)
           {
               int a=Integer.parseInt(k);
               if(max<a)
               {
                   max=a;
               }
               else
               {
                   return false;
               }
           }
        }
        return true;
        
    }
}