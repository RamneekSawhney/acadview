//Remove consective duplicates in a string
import java.util.Scanner;
import java.lang.String;
class RemVowel
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i;
        String s1=s.nextLine();
        char[] s2=s1.toCharArray();
        int num=s1.length();
        String s3="";
        int j=0;
        for(i=0;i<num-1;i++)
        {
            if(s2[i]=='a'||s2[i]=='e'||s2[i]=='i'||s2[i]=='o'||s2[i]=='u'||s2[i]=='A'||s2[i]=='E'||s2[i]=='I'||s2[i]=='O'||s2[i]=='U')
            {
                continue;
            }
            else
            {
                s3+=s2[i];
            }
            
        }
        System.out.println(s3);
    }
}