
package day2;

public class operators {
    static void main(String[] args) {
//        int x = 10;
//        int y = 20;
//        System.out.println(x == y); //false
//        System.out.println(x = y); //20
//        System.out.println("x = "+ x); //20
//        System.out.println(x != y); //false
//        double a = 15;
//        int b =15;
//        System.out.println(a==b); //true
//        System.out.println(a!=b); //false
//        int a =25;
//        System.out.println("The value of a = "+a); //25
//        int b=25;
//        System.out.println("The sum of a and b = "+a+b); //50
//        a = a+5;
//        a += 5; // shorthand assignment --> a =a +5 = 35
//        System.out.println(a); //30
//        a = a-5; //30
//        a -=5;
//        System.out.println("The sub of a - 5 = "+a);
//
//        a =a *5;
//        a *= 5;
//        System.out.println("The multi of a * 5 ="+a);
//        a =a /5;
//        a /= 5;
//        System.out.println("The div of a / 5 = "+a);
//
//        System.out.printf("The div of a is:%d%n" ,a/5);
//
//        int x=31;
//        int y=3;
//        System.out.println(x % y);
//
//        // Relational Operations ->Binary
//        int a = 7;
//        int b = 5;
//        int c = 7;
//        int d = 7;
//
//        System.out.println(a > b);//T
//        System.out.println(a < b);//F
//        System.out.println(a == b);//F
//        System.out.println(a >= b);//T
//        System.out.println(a <= b);//F
//
//
//
//
//        // Logical Operators -> Unary and Binary
//        boolean v1 = true;
//        boolean v2 = false;
//        System.out.println(v1 && v2); // AND => F
//        System.out.println(v1 || v2); // OR  => T
//
//        System.out.println(a > b && b < c); // true
//        // T      T
//
//        System.out.println(a > b && b > c); // false
//        //T     F
//
//        System.out.println(a < b || d > c); // false
//        //F     F
//
//        System.out.println(a <= b || d >= c); // true
//        //F     T
//
//        int abdi = 20;
//        int almi = 15;
//        boolean tamioz = true;
//          //     T            T
//        if (abdi >= almi ||  tamioz)
//        {
//            System.out.println("ادخل علمي"); //t
//        }
//        else
//        {
//            System.out.println("ادخل ادبي");  //f
//        }
//     Increment and Decrement Operators
        int num = 10;
        System.out.println(num++); //10 post increment => num + 1 (Save in memory)
        System.out.println(num); //11

        System.out.println(++num); //12 pre increment => increase (num) then display

        int number =5;
        System.out.println(number++);//5
        System.out.println(number); //6
        System.out.println(++number);//7

        // ternary operator
        int a = 18 , b = 10 , c;
        c = (a > b) ? a : b; // if a > b is true then c = 2 false c = b
        System.out.println("The Largest value is:" + c);// 18

        if(a>b)
            c=a;
        else
            c=b;

    }
}
