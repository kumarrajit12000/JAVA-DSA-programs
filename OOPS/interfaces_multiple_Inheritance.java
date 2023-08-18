import java.util.*;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;
public class interfaces_multiple_Inheritance {
    public static void main(String args[]){
        tiger t =new tiger();
        t.eat();
        t.walk();

    }
}

interface herbivore{
    
    void eat();

}
interface carnivore{
    void eat();
    void walk();
}
class tiger implements herbivore,carnivore {
 public  void eat(){
    System.out.println("tiger eat grass and  meat");
 }
 public void walk(){
    System.out.println("walks on 4 legs");
 }
}