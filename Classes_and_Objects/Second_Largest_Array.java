import java.util.Scanner;
class Second_Largest_Array
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,j,temp;
        int count=1;
        int[] A=new int[10];
        System.out.println("Enter the elements for an array of size 10");
        for(i=0;i<10;i++)
        {
            A[i]=s.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=i;j<10;j++)
            {
                if(A[j]>A[i])
                {
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
    for(i=0;i<10;i++)
    {
        if(count==0)
        {
            System.out.println("Second Largest element in the array is : "+A[i]);
        }
        count--;
    }
    }
}