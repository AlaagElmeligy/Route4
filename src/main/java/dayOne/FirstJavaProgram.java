package dayOne;

public class FirstJavaProgram {
    public static void main(String[] args)
    {System.out.println("Hello big boy!");

//        // Comment Line
        /*
        {System.out.println("Hello big boy!");
        */
        // Variable
        // Declaration
        // dataType variableName = value ; Initialization
//        String firstName ="Alaa"; // store text into variable -> string can contain leteers , numbers, and special characters ""
//        String x = "2+2";
//        System.out.println(x);
//        String X = "10";
//        String y = "15";
//        System.out.println(X+y); // 1015 --> Concatenation//      -> combining two string together
//        // Numbers
        //1- int
//        int x =1;
//        int y =2;
//        System.out.println(x+y);
//       // System.out.println("Sum of x and y is: " ,x+y); // problem Number 2
//        System.out.println("Sum of x and y is: ");
//        System.out.println(x+y);
//        System.out.println("Sum of x and y is: "+(x+y));
//
//        //2- Float
//        float f =12.09f;
//        System.out.println(f);

//        //3- Double
//        double d = 55; //55.0
//        double l = 55.33; //55.33
//        System.out.println(d);
//        System.out.println(l);

        String firstName ="Alaa";
        String lastName = "Gamal";
        String fullName =firstName + " " + lastName; // concatenation -> combining two string together
        int age =27;
        String dateOfBirth =" 09/09/1998";
        String job =" Testing Engineer";
        double income = 100000;
        double tax = income * 0.15; // 15% tax
        double netSalary = income - tax;
        //print
        System.out.println("Hello my name is: " + fullName+
                "\n my age is : " +age+
                "\n my job is : " +job+
                "\n my income is: " +(income - tax)+
                "\n my income is: " + netSalary);

        System.out.println("----------------------------------------");
        System.out.printf("Hello my full name is: %s%n"+
                        "my age is: %d%n"+
                        "my job is: %s%n"+
                        "my income is: %f%n" ,
                fullName , age , job , netSalary);


    }
}
