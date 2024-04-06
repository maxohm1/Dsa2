package OOPS;

import java.util.Scanner;

public class classes {

    public static class Car{
        String name;
        String type;
        int price;
    }
    public static void chan(Student s){
        s.name= "om";

    }
   public static class Student{
        String name;
        int rollno;
        double percentage;
   }
    public static void change(int y){
        y=7;
        return;

    }
    public static void fun(Student x){
        System.out.println(x.name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student x= new Student();
        x.name= "maxohm";
        x.rollno = 43;
        x.percentage =92.5;
        System.out.println(x.name);
        chan(x);
        System.out.println(x.name);

        Student s2= new Student();
        s2.name= "ohm";
        s2.rollno= 32;
        s2.percentage= 53.23;
        System.out.println(s2.percentage+5);

        fun(x);

        Car c1= new Car();
        c1.name= "Alto";
        c1.type= "Suv";
        c1.price= 234342;
        System.out.println(c1.name);

        int y= 5;
        System.out.println(y);
        change(y);
        System.out.println(y);
    }


}
