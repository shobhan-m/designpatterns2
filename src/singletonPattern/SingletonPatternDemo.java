package singletonPattern;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonPatternDemo {
   public static void main(String[] args) throws FileNotFoundException, IOException {

    
	   SingletonSample object1 = SingletonSample.getInstance();

      System.out.println("hashcode of Obj1::"+object1.getInstance().hashCode());
      
      SingletonSample object2 = SingletonSample.getInstance();
    
     
      System.out.println("hashcode of Obj2::"+object2.getInstance().hashCode());
      
      SingletonSample object3 = SingletonSample.getInstance();
      
      System.out.println("hashcode of Obj3::"+object3.getInstance().hashCode());
 
   }
}