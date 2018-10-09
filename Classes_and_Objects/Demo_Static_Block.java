import java.util.Scanner;
class InfoSibling
{
    String child;
    static String father;
    static
    {
        father="James";
    }
}
class Demo_Static_Block
{
    public static void main(String[] args)
    {
        InfoSibling son=new InfoSibling();
        son.child="Adam";
        InfoSibling daughter=new InfoSibling();
        daughter.child="Courtiney";
        System.out.println(son.child+" is the son of "+son.father);
        System.out.println(daughter.child+" is the daughter of "+daughter.father);
    }
}