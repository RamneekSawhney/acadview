import java.util.Scanner;
class Largest_of_3
{
    //Main function
    //If member function is static, then there is no need to access it using object. 
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three integers");
        int test1=s.nextInt(); //Takes input form user
        int test2=s.nextInt();
        int test3=s.nextInt();
        int result;
        result=test1>test2?(test1>test3?test1:test3):test2>test3?test2:test3;
        System.out.println("Greatest : "+result);
    }
}