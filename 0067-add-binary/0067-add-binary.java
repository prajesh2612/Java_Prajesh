class Solution {
    public String addBinary(String a, String b) {
        int l1=a.length();
        int l2=b.length();
                
        int max=Math.max(l1,l2);
        int min=Math.min(l1,l2);
        int diff=max-min;
        for(int i=0;i<diff;i++)
        {
            if(l1==min)
            {
                a="0"+a;
            }
            else if(l2==min)
            {
                b="0"+b;
            }
        }
        String result="",d="";
        int i=max-1;
        while(i>=0)
        {
            char chr1=a.charAt(i);
            char chr2=b.charAt(i);
            System.out.println(chr1+" "+chr2);
            if((chr1=='0')&&(chr2=='0'))
            {
                System.out.println("1st case");
                if(d.equals("1")==true)
                {
                    result="1"+result;
                }
                else
                {
                    result="0"+result;
                }
                d="";
            }
            else if(((chr1=='0')&&(chr2=='1'))||((chr1=='1')&&(chr2=='0')))
            {
                System.out.println("2nd case");
                if(d.equals("1")==true)
                {
                    result="0"+result;
                    d="1";
                }
                else
                {
                    result="1"+result;
                }
            }
            else if((chr1=='1')&&(chr2=='1'))
            {
                System.out.println("3rd case");
                if(d.equals("1")==true)
                {
                    result="1"+result;
                }
                else
                {
                    result="0"+result;
                }
                d="1";
            }
            i--;
        }
        if(d.equals("1")==true)
        {
            result="1"+result;
        }
        return result;
        
    }
}