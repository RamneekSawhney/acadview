import java.util.Scanner;
class Pattern2
{
    public static void main(String[] args)
    {
        int i,j;
        String a="*";
        for(i=5;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}