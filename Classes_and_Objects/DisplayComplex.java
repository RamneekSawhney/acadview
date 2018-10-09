import java.util.Scanner;
class Complex
{
    int real;
    int imaginary;
    Complex()
    {
        this.real=2;
        this.imaginary=5;
    }
    int Display()
    {
        System.out.println("The complex number is :");
        System.out.println(real+"+"+imaginary+"i");
        return 0;
    }

}
class DisplayComplex
{
    public static void main(String[] args)
    {
        Complex a=new Complex();
        a.Display();
    }
}