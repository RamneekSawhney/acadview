abstract class Animal1
{
    String color,name,breed;
    abstract void Eat();
    void Speak()
    {
        System.out.println("Ainmal's voice");
    }
}

class Cat extends Animal1
{
    Cat(String a,String b, String c)
    {
        color=a;
        name=b;
        breed=c;
    }
    void Eat()
    {
        System.out.println("Cats eat cat food");
    }
    void Speak()
    {
        System.out.println("Cat Meows");
    }
}
class AbstractAnimal
{
    public static void main(String[] args)
    {
        Animal1 c=new Cat("White","Shiro","Khao Manee");
        c.Speak();
        c.Eat();
        System.out.println("I own a cat named "+c.name+". She is a "+c.breed+" and is "+c.color+" in color." );
    }
}