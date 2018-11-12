
import java.util.Scanner;
import java.lang.String;
class Count_Words
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i;
        String s1=s.nextLine();
        char[] s2=s1.toCharArray();
        int num=s1.length();
        int count=0;
        if(s2[0]!=' ')
        {
            count+=1;
        }
        for(i=0;i<num-2;i++)
        {
            if(s2[i]==' ')
            {
                count+=1;
            }
            else
            {
                continue;
            }
            
        }
        System.out.println("Number of words: "+count);
    }
}