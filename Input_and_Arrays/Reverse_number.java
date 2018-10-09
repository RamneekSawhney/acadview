import java.util.Scanner;
class Reverse_number
{
	public static void main(String[] args)
	{
		int num,m,count=0;
		int rev=0;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter an Integer");
		num=n.nextInt();
		m=num;
		while(m!=0)
		{
			count++;
			m=m/10;
		}
		for (int i=0;i<count;i++)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		System.out.println("Reverse of the number is "+rev);
	}
}