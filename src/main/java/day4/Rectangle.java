package day4;
import java.util.Scanner;
//Class => blueprint, container
public class Rectangle {
    //Encapsulation => data hiding , data protection, data security


    Scanner input = new Scanner(System.in);

   //Data hiding: prevent direct modification of fields
   //Benefit: improve security, maintainability, and flexibility.
    private double length; // field
    private double width; //  field

    public void setLength(double length)
    {
        if(length > 0)
            this.length = length;
        else
            System.out.println("Length must be positive");
    }

    public double getLength()
    {
        return length; //5.5
    }

    public void setWidth(double width)
    {
        if(width > 0)
            this.width = width;
        else
            System.out.println("width must be positive");
    }

    public double getWidth()
    {
        return width;
    }

    public double calculateArea()
    {
        return getLength() * getWidth();
    }

//    public double calculateArea(){
//        System.out.println("Enter length of rectangle");
//        length = input.nextDouble();
//        System.out.println("Enter width of rectangle");
//        width = input.nextDouble();
//        double area = length * width;
//        System.out.println("The area of the rectangle is " + area);
//        return area;
//    }

}
