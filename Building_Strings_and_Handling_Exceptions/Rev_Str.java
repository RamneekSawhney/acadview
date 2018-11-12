import java.util.Scanner;
class Rev_Str
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char[] s2=s1.toCharArray();
        int i,j=0;
        String s3="";
        for(i=s1.length()-1;i>=0;i--)
        {
            s3+=s2[i];
        }
        System.out.println(s3);
        s.close();
    }
}