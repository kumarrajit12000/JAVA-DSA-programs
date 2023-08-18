import  java.util.*;
public class constructor {
    public static void main(String args[]){
        Student s1=new Student();
        
        
        // s1.name="rajit";
        // s1.roll=123;
        // s1.marks[0]=100;
        // s1.marks[1]=90;
        // s1.marks[2]=80;

        // Student s2 =new Student(s1);

        }    
}
class Student{
    String name;
    int roll;
    int marks[];

    Student(){
        System.out.println("non parameterized constructor called");
    }

    Student(String name,int roll){
        System.out.println(" parameterized constructor called");
        this.name=name;
        this.roll=roll;
        
    }
    //shallow copy constructor
    // Student(Student s1){
        
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

}
