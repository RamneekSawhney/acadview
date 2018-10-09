final class Base
{
    void Disp()
    {
        System.out.println("Class with final keyword can't be extended");
    }
}
/*class Inherit extends Base
{
    void Disp()
    {
        System.out.println("Class with final keyword was be extended");
    }
}*/
class NoExtend
{
    public static void main(String[] args)
    {
        Base d=new Base();
        d.Disp();
    }
}