package day6;

public interface Vehicle{
    void start(); // abstract method

    default void stop()
    {
        System.out.println("Hello from Vehicle interface");
    }

    default void stops()
    {
        System.out.println("Bike stops with a Kick.");
    }

    /*
-Create an abstract class 'Animal' with 'makeSound()' as abstract.
-Subclasses: 'Dog', 'Cat', 'Cow' implement it.
-Store them in an array of 'Animal()' and call 'makeSound()' -> each has its own implementation.
*/

// What is default methods"

// How could abstract enables polymorphism?
}