package day6;


abstract class Shape {
//Abstraction: hiding implementation details and showing only the essential behavior
//Focus on => what an object does, not how it does it.

/*
In real life: when you drive a car, you use the stearing whel and pedals (interface).
but you don't worry about how the engine works (implementation hidden)
*/

/*
1- Abstract classes
   - Can have both abstract methods (no body) and concrete methods.
   - Cannot be instantiated directly.

2- Interfaces
   - Can only have abstract methods (until Java 8,now can have defult and static methods).
   - Cannot be instantiated directly.
*/

    abstract void draw(); //abstract

    void info() //concrete
    {
        System.out.println("Shape info: This is a shape .");
    }


}