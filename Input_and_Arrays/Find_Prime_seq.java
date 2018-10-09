import java.util.Scanner;
class Find_Prime_seq
{
    public static void main(String[] args)
    {
        int i,j;
        int flag=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        System.out.println("Prime Numbers:");
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    flag+=1;
                }
            }
            if(flag<=2 && i!=1)
            {
                System.out.println(i);
            }
            flag=0;
        }
    }
}