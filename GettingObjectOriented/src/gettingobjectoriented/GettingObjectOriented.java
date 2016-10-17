package gettingobjectoriented;

import java.util.*;

public class GettingObjectOriented {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       Person john = new Person();
       john.firstname = "John";
       john.lastname = "Doe";
       john.birthday = new GregorianCalendar(1988,1,5);
       
       Person jane = new Person();
       jane.firstname = "Jane";
       jane.lastname = "Diamond";
       jane.birthday = new GregorianCalendar(1986,1,5);
       
       
               System.out.println(john.firstname + " " + john.lastname);
               System.out.println(jane.firstname + " " + jane.lastname);
               
               System.out.println(john.age(new GregorianCalendar()));
               System.out.println(jane.age(new GregorianCalendar()));
    }
    
}
