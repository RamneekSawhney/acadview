import java.util.Scanner;
class Rectangle
{
    int length;
    int breath;
    int CalculateArea(int length,int breath)
    {
        int area;
        area=length*breath;
        return area;
    }

}
class CalcArea
{
    public static void main(String[] args)
    {
        Rectangle a=new Rectangle();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        a.length=s.nextInt();
        System.out.println("Enter the breath of rectangle");
        a.breath=s.nextInt();
        int area=a.CalculateArea(a.length,a.breath);
        System.out.println("Area of the rectangle is: "+area);
    }
}