
class Print_Substr
{
    public static void main(String[] args)
    {
        String s1="xyz";
        char[] s2=s1.toCharArray();
        int i,k;
        int count=0;
        for(i=0;i<s1.length();i++)
        { count=i+1;
            for(k=0;k<s1.length();k++)
            {
                if(count!=0)
                {
                    System.out.print(s2[k]);
                    count--;
                }
                else
                {
                    System.out.println();
                    count=i+1;
                    k-=count;
                }
            }
            System.out.println();
        }
    }
}