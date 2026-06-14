package day6;

public class Calculator {


/*
## Method Overloading (Compile-time polymorphism)

- **Same method name**,but  **different parameter list** (type, number, or order).
-Happens **in the same class**.
-Return type *can*  be different, but parameters mus be different.
-Resolved at **compile-time**
*/

//Overloading: same name ,differ params

int add(int a, int b){
 return a+b;
}

double add(double a, double b){
 return a+b;
}

int add(int a, int b,int c){
 return a+b+c;
}
}
