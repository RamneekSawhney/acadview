import java.util.Scanner;
class Add_Numbers
{
    //Main function
    //If member function is static, then there is no need to access it using object. 
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two integers");
        int test1=s.nextInt(); //Takes input form user
        int test2=s.nextInt();
        int test3;
        test3=test1+test2;
        System.out.println("Sum : "+test3);
    }
}