class Array_sort
{
    public static void main(String[] args)
    {
        int temp,i,j;
        int[] A=new int[]{1,1,1,1,0,0,1,0};
        for(i=0;i<A.length;i++)
        {
            for(j=i;j<A.length;j++)
            {
                if(A[i]>A[j])
                {
                    temp=A[j];
                    A[j]=A[i];
                    A[i]=temp;
                }
            }
        }
        for(i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
    }
}