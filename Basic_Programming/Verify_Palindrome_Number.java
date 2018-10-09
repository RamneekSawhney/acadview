import java.util.Scanner;
class Verify_Palindrome_Number
{
	public static void main(String[] args)
	{
		int num,m,count=0;
		int rev=0;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the Integer");
		num=n.nextInt();
		m=num;
		int j=num;
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
		if (rev==j)
		{
			System.out.println("Yes "+j+" is a palindrome");
		}
		else
		{
			System.out.println("No "+j+" is not a palindrome");
		}
	}
}