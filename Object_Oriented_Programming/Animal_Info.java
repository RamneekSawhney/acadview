class Animal
{
    String breed,color;
    void Speak()
    {
        System.out.println("Animal's Voice");
    }
}
class Dog extends Animal
{
    void Speak()
    {
        System.out.println("Dog Barks");
        breed="Husky";
        color="Black";
    }
}
class Cat extends Animal
{
    void Speak()
    {
        System.out.println("Cat Meows");
        breed="Khao Manee";
        color="White";
    }
}
class Animal_Info
{
    public static void main(String[] args)
    {
        Dog ob1=new Dog();
        Cat knobi=new Cat();
        ob1.Speak();
        System.out.println("I own a dog named Kuro. He is a "+ob1.breed+" and is "+ob1.color+" in color." );
        knobi.Speak();
        System.out.println("I also own a cat named Shiro. She is a "+knobi.breed+" and is "+knobi.color+" in color." );
    }
}