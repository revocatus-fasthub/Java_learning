package constructors;

import java.util.*;

public class Constructors {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       Person2 john = new Person2("John", "Doe");
       Person2 jane = new Person2("Jane", "Diamond", new GregorianCalendar(1986,9,12));
       
       System.out.println(
               "Hello my name is " +
               john.fullname() +
               ".I am " +
               john.age(new GregorianCalendar()) +
               "years old."
       );
       
       System.out.println(
               "Hello my name is " +
               jane.fullname() +
               ".I am " +
               jane.age(new GregorianCalendar()) +
               "years old."
       );
       
    }
    
}
