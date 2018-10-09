import java.util.Scanner;
class Array_Search
{
    public static void main(String[] args)
    {
        int temp,i,j;
        int flag=0;
        Scanner s=new Scanner(System.in);
        int[] A=new int[]{1,4,6,7,8,9,10};
        System.out.println("Enter Integer to search");
        int num=s.nextInt();
        for(i=0;i<A.length;i++)
        {
            if(num==A[i])
            {
                System.out.println("Integer found at position (Starting from zero) : "+i);
                flag=1;
                break;
            }

        }
        if(flag==0)
        {
            System.out.println("Integer doesn't exist in array");
        }
    }
}