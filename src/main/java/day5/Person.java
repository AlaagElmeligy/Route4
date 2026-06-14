package day5;

public class Person {
    String name; //Gloabal variable/Field
    int age;
    char gender;

//Constructor => special method in a class that is automaticaly called when an object is created.

//default constructor

    Person()
    {
        System.out.println("I'm the default constructor");
    }

// Signature
    Person(String name , int age , char gender) {
// setter
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void printData()
    {
// get
        System.out.println("Hello my name is " + name + " I'm " + age + " Years old and my gender is : " + gender);
    }

}