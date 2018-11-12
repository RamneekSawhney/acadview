import java.util.Scanner;

public class Str_Occur
{
    public static void check(String s1,String s2)
    {
        int a=s1.length();
        int b=s2.length();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int i,j=0,flag=0;
        for(i=0;i<a-b;i++)
        {
            j=0;   
            if(c1[i]==c2[j]) 
            {
                ++j;
                while(j<b)
                {
                    if(c1[i+j]==c2[j])
                    {
                        flag=1;
                    }
                    else
                    {
                        flag=0;
                        break;
                    }
                    ++j;
                }
            }
            if(flag==1)
            {
                System.out.println("Substring Exists");
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==0)
        {
            System.out.println("Substring doesn't exist");
        }
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=s.nextLine();
        System.out.println("Enter the string to check occurrence in the first string");
        String s2=s.nextLine();
        check(s1,s2);
    }
}