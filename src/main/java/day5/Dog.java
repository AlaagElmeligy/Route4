package day5;

public class Dog extends Animal{
    public void bark()
    {
        System.out.println("This animal barks");
    }


    @Override // this tells java, we will override a method from the parent class
    public void eat()
    {
        System.out.println("This dog eats bones");
    }

/*
Create a Vehicle superclass:
  Fields: brand , year
  Method: start() prints "Vehicle started"
Create subclasses:
  Car adds method honk()
  Bike adds method ringBell()
Instantiate both and demonstrate inherited + own method.
*/

}
