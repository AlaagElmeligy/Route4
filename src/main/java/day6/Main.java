package day6;

public class Main {
    public static void main(String[] args) {
//        Vehicle v1  = new Bike();
//        Vehicle v2  = new Car();
//
//        v1.start();
//        v1.stop();
//        v2.start();

//        Shape s1 = new Circle();
//        Shape s2 = new Square();
//        s1.draw();
//        s2.draw();
//        s1.info();
//        s2.info();

//            Animal[] animals = {new Dog(), new Cat(), new Cow()};
//
//            for (Animal animal : animals) {
//                animal.makeSound();
//            }
        Calculator calculator = new Calculator();
        calculator.add(1,2);
        calculator.add(3,5,6);
        double x = calculator.add(5.6,7.6);
        System.out.println(x);
  }
}