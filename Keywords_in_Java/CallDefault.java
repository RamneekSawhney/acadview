class Test
{
    Test()
    {
        System.out.println("In default constructor of Test");
    }
    Test(String a)
    {
        this();
        System.out.println("In parameterized constructor of Test");
    }
}
class CallDefault
{
    public static void main(String[] args)
    {
        Test t=new Test("Hello");
    }
}