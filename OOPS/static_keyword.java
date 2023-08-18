import java.util.*;
public class static_keyword {
     public static void main(String args[]){
        Student s1=new Student();
        s1.student_details("Rajit", 123);
        s1.getStudentDetails(); 
        System.out.println( s1.calPercentage(97, 65, 96));
        
     }    
}
class Student{
    String name ;
    int roll;
    static String school_name ;

    static int calPercentage(int bio,int phy ,int che){
        return (bio+phy+che)/3;
    }

    void student_details(String name,int roll){
        this.name=name;
        this.roll=roll;
    }

    void getStudentDetails(){
        System.out.println(this.name);
        System.out.println(this.roll);
    }
}
