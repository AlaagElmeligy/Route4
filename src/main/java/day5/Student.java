package day5;

public class Student {
        private String name;
        private double grade;

public void setName(String name) {
        this.name = name;
         }

public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100)
            this.grade = grade;
        else
            System.out.println("Enter values between 0-100");
        }

 public String getName() {
            System.out.print("Name: " + name);
            return name;
        }

  public void students(){
           System.out.print("Name: "+name+" Grade: "+grade);
                }
    }

