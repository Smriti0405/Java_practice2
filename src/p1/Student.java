package p1;

import java.util.Scanner;

public class Student {
    public int roll;
    public String name;

    public Student()
    {
        Scanner s = new Scanner(System.in);
         roll = s.nextInt();
         name = s.next();
    }

//    public Student(String n, int r){
//        name = n;
//          roll = r;
//    }
    public void display(){
        System.out.println(roll + " "+ name);
    }
}
