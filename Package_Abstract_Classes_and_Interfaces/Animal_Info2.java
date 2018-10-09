interface Animal_Detail
{
    void Speak();
    void Eat();
}
abstract class Animal implements Animal_Detail
{
    String breed,color;
}
class Dog extends Animal
{
    Dog()
    {
        breed="Husky";
        color="Black";
    }
    public void Speak()
    {
        System.out.println("Dog Barks");

    }
    public void Eat()
    {
        System.out.println("Dogs eat dog food");
    }
}
class Cat extends Animal
{
    Cat()
    {
        breed="Khao Manee";
        color="White";
    }
    public void Speak()
    {
        System.out.println("Cat Meows");
    }
    public void Eat()
    {
        System.out.println("Cats eat cat food");
    }
}
class Animal_Info2
{
    public static void main(String[] args)
    {
        Animal ob1=new Dog();
        Animal knobi=new Cat();
        ob1.Speak();
        ob1.Eat();
        System.out.println("I own a dog named Kuro. He is a "+ob1.breed+" and is "+ob1.color+" in color." );
        knobi.Speak();
        knobi.Eat();
        System.out.println("I also own a cat named Shiro. She is a "+knobi.breed+" and is "+knobi.color+" in color." );
    }
}