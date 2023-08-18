import java.util.*;
public class GettersAndSetters {
    public static void main(String args[]){
        Student s1 =new Student();
        s1.setname("rajit");
        s1.setroll(123);
        s1.getname();
        s1.getroll();
     
    }
}
class Student{
    private String name;
    private int roll;
    

    void setname(String name){
        this.name = name;
    }
    void setroll(int roll){
        this.roll = roll;
    }
    void getname(){
        System.out.println(name);
    }
    void getroll(){
        System.out.println(roll);
    }
}
