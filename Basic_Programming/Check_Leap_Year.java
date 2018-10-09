import java.util.Scanner;
class Check_Leap_Year
{
    //Main function
    //If member function is static, then there is no need to access it using object. 
    public static void main(String[] args)
    {
        System.out.println("Enter a Year");
        Scanner s=new Scanner(System.in);
        int test1=s.nextInt(); //Takes input form user
        if(test1%4==0 && test1%100!=0 || test1%400==0)
        {
            System.out.println("The year "+test1+" is a leap year");
        }
        else
        {
            System.out.println("The year "+test1+" is not a leap year");
        }
    }
}